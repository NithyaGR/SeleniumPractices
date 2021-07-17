package inteviewPracticePrograms;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadingAFile {

	public static void main(String[] args) {
		String fileData = "";
		try{
			File file = new File("newTextFile.txt");
			Scanner reader = new Scanner(file);
			while (reader.hasNextLine()){
				fileData = reader.nextLine();
				System.out.println(fileData);
			}
			reader.close();
		}
		catch(IOException e){
			System.out.println("Error occured... "+e.getMessage());
		}
		System.out.println(fileData.hashCode());
		System.out.println("The no of chars is "+fileData.length());
		String[] words = fileData.split(" ");
		System.out.println("The no. of words in the file is "+words.length);
		fileData = fileData.replace(" ", "");
		System.out.println(fileData);
		fileData = fileData.replace(".", "");
		System.out.println(fileData);	
		System.out.println("The no. of words is "+fileData.length());
		System.out.println(fileData.hashCode());
		
		
		

	}

}
