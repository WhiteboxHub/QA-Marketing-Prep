package com.innovapath.programs.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileContent {

	public static void main(String[] args) {

		String sourceFileName="resources/test.txt";
		String destinationFileName="resources/test1.txt";
		FileReader sourceFile = null;
		FileWriter destinationFile=null;
		BufferedReader sourceReader=null;
		try {
			sourceFile = new FileReader(sourceFileName);
			destinationFile = new FileWriter(destinationFileName,false);
			
			sourceReader = new BufferedReader(sourceFile);
			String line=null;
			while((line=sourceReader.readLine())!=null)
			{
				destinationFile.write(line);
				destinationFile.write("\n");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				destinationFile.close();
				sourceFile.close();
				sourceReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
		//Reading the new file
		try {
			sourceFile = new FileReader(destinationFileName);
			sourceReader = new BufferedReader(sourceFile);
			String line;
			System.out.println("Content of the destination file");
			while((line=sourceReader.readLine())!=null)
			{
				System.out.println(line);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				sourceFile.close();
				sourceReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	
	
	

}
