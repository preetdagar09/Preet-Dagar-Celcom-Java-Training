package com.celcom.day8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileWriter;

public class ImageCopy {
	public static void main(String[] args) throws IOException {
		FileInputStream fr = new FileInputStream("D:\\JavaTraining\\AnimalImage.jpg");
		FileOutputStream fw = new FileOutputStream("D:\\JavaTraining\\AnimalImage2.jpg");
		
		int ch = 0;
		while((ch = fr.read()) != -1) {
			fw.write(ch);
		}
		fr.close();
		fw.close();
		System.out.println("Image Copied");

	}
}
