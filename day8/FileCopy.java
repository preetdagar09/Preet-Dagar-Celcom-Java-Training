package com.celcom.day8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileWriter;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:\\JavaTraining\\Welcome to java Programming.txt");
		FileWriter fw = new FileWriter("D:\\JavaTraining\\FileCopy.txt");
		
		int ch = 0;
		while((ch = fr.read()) != -1) {
			fw.write(ch);
		}
		fr.close();
		fw.close();
		System.out.println("FIle Copied");

	}

}
