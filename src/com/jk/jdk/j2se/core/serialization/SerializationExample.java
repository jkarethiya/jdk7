/**
 * @author Jitendra Arethiya
 * @version 1.0
 * @since 11-Jul-2015 8:59:10 pm
 */
package com.jk.jdk.j2se.core.serialization;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

public class SerializationExample implements Serializable {

	private static final long serialVersionUID = -2793572038178259466L;
	private static SerializationExample instance = new SerializationExample(); 

	private A a = new A();
	
	public static SerializationExample getInstance() {
		
	    return instance;
	}
	
	private SerializationExample() {
	}
	
	private Object readResolve()  {
		System.out.println("readResolve called..." + instance);
	    return instance;
	}
	
	public static void main(String[] args) throws Throwable {
	
		SerializationExample s = SerializationExample.getInstance();
	    
	    System.out.println("s:- " + s);
	    System.out.println("s.a:- " + s.a);
	    
	    ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("obj.ser"));
	    os.writeObject(s);
	    os.close();
	    
	    s.a = new A();
	    
	    ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("obj.ser"));
	    SerializationExample s1 = (SerializationExample) ois1.readObject();
	    ois1.close();
	    System.out.println("s1:- " + s1);
	    System.out.println("s1.a:- " + s1.a);
	    
	
/*	    ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
	    ObjectOutputStream oos = new java.io.ObjectOutputStream(baos);
	    oos.writeObject(getInstance());
	    oos.close();
	
	    s.i = 7; //modified after serialization
	
	    InputStream is = new ByteArrayInputStream(baos.toByteArray());
	    ObjectInputStream ois = new ObjectInputStream(is);
	    SerializationExample deserialized = (SerializationExample) ois.readObject();
	    System.out.println(deserialized.i);  // prints 5
*/	}
}

class A implements Serializable {
	
	public A() {
		System.out.println(this.getClass().getName() + " constructor called...");
	}
	
	private Object readResolve() throws ObjectStreamException {
		System.out.println("read....");
		return this;
	}
	
}