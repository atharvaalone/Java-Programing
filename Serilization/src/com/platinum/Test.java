package com.platinum;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		System.out.println("Serilization Started");
		String File = "/Users/atharva/Desktop/S.txt";
		SerilizationTest s = new SerilizationTest();
		FileOutputStream fos = new FileOutputStream(File);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s);

		System.out.println("Deserilization Started");
		FileInputStream fis = new FileInputStream(File);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object o = ois.readObject();
		SerilizationTest s2 = (SerilizationTest) o;
		System.out.println(s2.i + " " + s2.j);

	}

}
