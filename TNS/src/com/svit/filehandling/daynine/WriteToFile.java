package com.svit.filehandling.daynine;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	

	
		
		public static void main(String[] args) {
			try {
				
			      FileWriter myWriter = new FileWriter("file.txt");
			      myWriter.write("This program is to Write content using file handling");
			      myWriter.close();
			      System.out.println("Successfully wrote to the file.");

				
			} catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();

			}
		}

}
