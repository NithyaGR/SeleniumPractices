package inteviewPracticePrograms;

public class StringPalindromeCheck {
	
	public String CheckPalindrome(String str1, String str2){
		
		String string;
		if (str1.equalsIgnoreCase(str2)){
			string = "Palindrome";
		}
		else {
			string = "Not a Palindrome";
		}
		return string;
		
	}

	public String ReversedString(String str){
		int length = str.length()-1;
		str = str.toLowerCase();
		String reverse = "";
		for (int i=length;i>=0;i--){
			reverse = reverse+str.charAt(i);
		}
		return reverse.toLowerCase();
	}
	public static void main(String[] args) {
		
		StringPalindromeCheck check = new StringPalindromeCheck();
		String result = check.CheckPalindrome("Racecar", check.ReversedString("Racecar"));
		System.out.println(result);
		

	}

}
