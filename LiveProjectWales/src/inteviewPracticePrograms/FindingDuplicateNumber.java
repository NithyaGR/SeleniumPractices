package inteviewPracticePrograms;

public class FindingDuplicateNumber {

	public static void main(String[] args) {
		
		int number = 12342;
		int reverse = 0;
		String tempString = "";
		String reverseString = "";
		/*System.out.println(number);
		System.out.println(number%10);*/
		do{
			number = number/10;
			reverse = number%10;
			tempString = Integer.toString(reverse);
			reverseString = reverseString+tempString;
			System.out.println(number);
			System.out.println(reverse);
			System.out.println(tempString);
			System.out.println(reverseString);
		}
		while(number>=10);
		
		number = 23454;
		String rev = "";
		String num = Integer.toString(number);
		System.out.println(num.length());
		for (int i=(num.length()-1); i>=0; i--){
			char c = num.charAt(i);
			rev = rev+c;
			
		}
		System.out.println(rev);
		
		
	}

}
