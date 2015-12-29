package com.innovapath.programs.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SearchStringCount {
	public static int countString(String fileName, String word)
			throws IOException {

		FileReader fileReader = new FileReader(fileName);
		BufferedReader bufferReader = new BufferedReader(fileReader);
		String line;
		int wordCount = 0;
		while ((line = bufferReader.readLine()) != null) {
			if (line.trim().length() != 0) {// For ignoring the empty lines in file
				String[] lineWords = line.split("\\s");
				for(String str : lineWords) {
					if (str.equals(word)) {
						wordCount++;
					}
				}
			}
		}
		System.out.println("The Count Of " + word + " is: " + wordCount);
		bufferReader.close();
		return wordCount;

	}

	public static void main(String[] args) throws IOException {
		String fileName = "resources/test.txt";
		SearchStringCount.countString(fileName, "Hello");
	}

}
