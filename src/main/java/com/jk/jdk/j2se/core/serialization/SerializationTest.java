/**
 * @author Jitendra Arethiya
 * @version 1.0
 * @since 12-Jul-2015 2:29:36 pm
 */
package com.jk.jdk.j2se.core.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @author KunaalATrehan
 *
 */
public class SerializationTest {

 /**
  * @param args
  * @throws IOException 
  * @throws FileNotFoundException 
  * @throws ClassNotFoundException 
  */
 public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	  ConnectionFactory INSTANCE=ConnectionFactory.getInstance();
	  
	  //Here I am serializing the connection factory instance
	  ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("connFactory.ser"));  
        oos.writeObject(INSTANCE);  
        oos.close();  
        
        //Here I am recreating the instance by reading the serialized object data store
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("connFactory.ser"));  
        ConnectionFactory factory1 = (ConnectionFactory) ois.readObject();  
        ois.close();  
        
        //I am recreating the instance AGAIN by reading the serialized object data store
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("connFactory.ser"));  
        ConnectionFactory factory2 = (ConnectionFactory) ois2.readObject();  
        ois2.close();
        
        //Lets see how we have broken the singleton behavior
        
        System.out.println("Instance reference check->" +factory1.getInstance());
        System.out.println("Instance reference check->" +factory2.getInstance());
        System.out.println("=========================================================");
        System.out.println("Object reference check->"+factory1);
        System.out.println("Object reference check->"+factory2);
 }

}

class ConnectionFactory implements Serializable {
 //Static variable for holding singleton reference object
 private static ConnectionFactory INSTANCE;
 
 /**
  * Private constructor
  */
 private ConnectionFactory(){  
 }
 
 /**
* Special hook provided by serialization where developer can control what object needs to sent.
* However this method is invoked on the new object instance created by de serialization process.
* @return
* @throws ObjectStreamException
*/
private Object readResolve() throws ObjectStreamException{
return INSTANCE;
}
 
 /**
  * Static method for fetching the instance
  * @return
  */
 public static ConnectionFactory getInstance(){
  //Check whether instance is null or not
  if(INSTANCE ==null){
   //Locking the class object
   synchronized(ConnectionFactory.class){
    //Doing double check for the instance
    //This is required in case first time two threads simultaneously invoke 
    //getInstance().So when another thread get the lock,it should not create the 
    //object again as its already created by the previous thread.
    if(INSTANCE==null)
     INSTANCE=new ConnectionFactory();
   }   
  }
  
  return INSTANCE;
 }
}

