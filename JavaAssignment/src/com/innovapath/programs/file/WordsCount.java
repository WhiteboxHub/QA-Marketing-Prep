package com.innovapath.programs.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordsCount {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		String fileName="resources/test.txt";
		FileReader fileReader=new FileReader(fileName);
		BufferedReader bufferReader=new BufferedReader(fileReader);
		String line=null;
		int wordCount=0;
		while((line=bufferReader.readLine())!=null)
		{
			if(line.trim().length()!=0){//For ignoring the empty lines in file
			String[] lineWords=line.split("\\s");
			wordCount=wordCount+lineWords.length;
			}
		}
		bufferReader.close();
		fileReader.close();
		System.out.println(wordCount);
		

	}

}
