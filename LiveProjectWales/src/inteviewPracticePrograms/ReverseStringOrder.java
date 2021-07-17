package inteviewPracticePrograms;

public class ReverseStringOrder {

	public static void main(String[] args) {
		
		String givenString = "dog";
		int length = givenString.length();
		String ReversedString = "";
		
		for(int i=length-1; i>=0; i--){
			
			//System.out.print(givenString.charAt(i));
			ReversedString = ReversedString+givenString.charAt(i);
			
			
			}
	System.out.println(ReversedString);
		

	}

}
