package com.oops;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderAndWriter {
	public static void main(String[] args) {
		//Try with resource closing syntax automatically closes the resources
		//introduced in java-7
		//like scanner, fileReader, fileWriter e.t.c
		//we have to use try with resource closing systax when the classes are implementing AutoCloseable and Closeable 

		try(Scanner sc=new Scanner(System.in);FileReader fr=new FileReader(sc.next());BufferedReader br=new BufferedReader(fr)) {
			System.out.println("Enter a file");
			int ch=0;
			String reader="";
			int counterFr=0;
			int counterBr=0;
			while((ch=fr.read())!=-1) {
				System.out.print((char)ch);
				counterFr++;
			}
			System.out.println();
			while((reader=br.readLine())!=null) {
				System.out.println(reader);
			}
			System.out.println();
			System.out.println("Counter of File Reader "+counterFr);
			System.out.println("Counter of Buffered Reader "+counterBr);
		}
		catch(IOException f) {
			System.out.println(f.getMessage());
		}
	}
}
