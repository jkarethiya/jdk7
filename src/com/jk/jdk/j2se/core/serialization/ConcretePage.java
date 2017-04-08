/**
 * @author Jitendra Arethiya
 * @version 1.0
 * @since 12-Jul-2015 2:51:18 pm
 */
package com.jk.jdk.j2se.core.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
 
public class ConcretePage implements Serializable {
	public static final long serialVersionUID = 1L;
	private String user;
	private transient String author;
	
	public ConcretePage(String user,String author){
		this.user=user;
		this.author=author;
	}
	private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeObject(this.author);
    }
 
    private void readObject(ObjectInputStream in) throws IOException,ClassNotFoundException {
        in.defaultReadObject();
        this.author = (String)in.readObject();
    }
 
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	 public static void main(String... args) throws Exception, IOException{
		   File f= new File("a.txt");
		   ConcretePage cp= new ConcretePage("Ankita","Atul");
		   
		   ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));  
	       out.writeObject(cp);  
	      
	       ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
	       cp=(ConcretePage)in.readObject();
	       System.out.println("After deserialize user is: " +cp.getUser()+" and author is:"+cp.getAuthor());   
	   }
}