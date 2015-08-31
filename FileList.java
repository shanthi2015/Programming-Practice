package edu.wbqa.files;

import java.io.File;

public class FileList {
	
		
	public static void main(String [] args){
		File folder = new File("C:/Users/Prashanti/Desktop/3");
	    File[] listOfFiles = folder.listFiles();
	 
	    for (int i = 0; i < listOfFiles.length; i++) {
	      if (listOfFiles[i].isFile()) {
	        System.out.println(listOfFiles[i].getName());
	      } else if (listOfFiles[i].isDirectory()) {
	        System.out.println(listOfFiles[i].getName());
	      }
	    }

	}

}
