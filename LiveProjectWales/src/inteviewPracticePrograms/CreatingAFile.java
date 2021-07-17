package inteviewPracticePrograms;

import java.io.File;
import java.io.IOException;

public class CreatingAFile {

	public static void main(String[] args) {
		
		try{
			File file = new File("newTextFile.txt");
			if (file.createNewFile()){
				System.out.println("File Created Successfully "+file.getName());
				System.out.println(file.getAbsolutePath());
			}
			else{
				System.out.println("File Exists Already");
			}
		}
		catch (IOException e){
			System.out.println("An error occured... "+e.getMessage());
		}
	}

}
