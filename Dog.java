package com.kabaso.mock.week10;
//java code for final with transient

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable {
	int i = 10;
	transient final int j = 20;
}

class MainDriver {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog d1 = new Dog();
		System.out.println("serialization started");
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		System.out.println("Serialization ended");

		System.out.println("Deserialization started");
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog) ois.readObject();
		System.out.println("Deserialization ended");
		System.out.println("Dog object data");

		System.out.println(d2.i + "\t" + d2.j);
	}
}
