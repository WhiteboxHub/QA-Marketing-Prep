package com.innovapath.programs.file;

import java.io.File;

public class ListFiles {

	public static void main(String[] args) {
		String directoryName="C:\\Program Files (x86)";
        File directory = new File(directoryName);
        File[] fList = directory.listFiles();
        for (File file : fList){
            System.out.println(file.getName());
        }

	}

}
