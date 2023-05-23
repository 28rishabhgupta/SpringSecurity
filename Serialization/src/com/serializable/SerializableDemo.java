package com.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableDemo {

	public static void main(String[] args) throws Exception{
		
		Dog d1 = new Dog();
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Hp\\OneDrive\\Desktop\\serializable\\myfile.text");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		
		Dog d2 = new Dog();
		FileInputStream fis = new FileInputStream("C:\\Users\\Hp\\OneDrive\\Desktop\\serializable\\myfile.text");
		ObjectInputStream oiStream = new ObjectInputStream(fis);
		d2 = (Dog)oiStream.readObject();
		
		System.out.println(d2.i +"********"+d2.string);
	}

}

class Dog implements Serializable{
	String string  = "Rishabh";
	int i = 10;
	
}
