package com.innovapath.programs.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileStringReplace {
	public static void replaceString(String fileName, String searchString,
			String replaceString) throws IOException {
		FileReader fileReader = new FileReader(fileName);
		BufferedReader bufferReader = new BufferedReader(fileReader);
		String line;
		StringBuffer fileContent = new StringBuffer();
		while ((line = bufferReader.readLine()) != null) {
			fileContent
					.append(line.replace(searchString, replaceString) + "\n");
		}
		bufferReader.close();
		FileWriter fileWriter = new FileWriter(fileName, false);
		fileWriter.write(fileContent.toString());
		fileWriter.close();

	}

	public static void main(String[] args) throws IOException {
		FileStringReplace.replaceString("resources/test.txt", "Hello", "Hi");
	}

}
