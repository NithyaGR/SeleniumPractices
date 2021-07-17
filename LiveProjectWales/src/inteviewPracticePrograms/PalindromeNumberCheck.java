package inteviewPracticePrograms;

public class PalindromeNumberCheck {

	static int num = 1234;
	public static void main(String[] args) {

		/*int number = num;
		int remainder = 0;
		int quotient = 0;
		String pal = "";
		do {
			remainder =  number%10;
			quotient = number/10;
			number = quotient;
			if(quotient>=0){
				System.out.println(remainder);
				pal = pal+remainder+"";
			}
		}
		while (quotient>0);
		System.out.println(pal);
		System.out.println(Integer.toString(num)+ " is toString of the given number "+num);
		if (Integer.toString(num).equals(pal))
			System.out.println("The given no. "+ num+" is a palindrome");
		if (Integer.parseInt(pal)== num){
			System.out.println("The given no. "+ num+" is a palindrome");
		}
		else System.out.println("Not a palindrome");*/
		int r =0;
		int reverse = 0;
		while(num>0){
			r = num%10;
			System.out.println("remainder is "+r);
			reverse = (reverse*10)+r;
			System.out.println("reverse number is "+reverse);
			num = num/10;
			System.out.println("number is "+num);
		}
		System.out.println(reverse);
		System.out.println(5%10);
	}

}
