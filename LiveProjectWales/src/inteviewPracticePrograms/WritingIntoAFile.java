package inteviewPracticePrograms;

import java.io.FileWriter;
import java.io.IOException;

public class WritingIntoAFile {

	public static void main(String[] args) {
		
				try{
					FileWriter writer = new FileWriter("newTextFile.txt");
					writer.write("First time writing into a file using Java. It is really good");
					System.out.println("Successfully wrote into this file");
					writer.close();
				}
				catch (IOException e){
					System.out.println("Error Occured...."+e.getStackTrace());
				}

	}

}
