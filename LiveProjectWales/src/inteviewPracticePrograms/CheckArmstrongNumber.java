package inteviewPracticePrograms;

import java.util.Scanner;

public class CheckArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check for Armstrong number");
		int num = sc.nextInt();
		System.out.println(totalNoOfDigits(num));
		int totalDigits = totalDigits(num);
		System.out.println(totalDigits);
		System.out.println(reverseInt(num,totalDigits ));
		//System.out.println(getDigitPosition(2));
		sc.close();

	}
	public static int totalNoOfDigits(int num){
		String s = Integer.toString(num);
		int totalDigit = s.length();
		return totalDigit;
	}
	public static int totalDigits(int number){
		int totalDigits = 1;
		int num = number;
		
		do{
			num = num/10;
			totalDigits++;
			}
		while(num>10);
		System.out.println("Total number of digits is :"+totalDigits);
		
		
		return totalDigits;
	}
	public static int reverseInt(int number, int totalDigits){
		int[] digitArray = new int[totalDigits];
		int reverseNum=0; 
		for(int i=0; i<totalDigits; i++){
			if (number >0){
				digitArray[i] = number%10;
				number = number/10;
				System.out.println(digitArray[i]);
				reverseNum = reverseNum+(digitArray[i]*getDigitPosition(i));
				//System.out.println(reverseNum);
			}
		}
		return reverseNum;
		
	}
	public static int getDigitPosition(int num){
		int digitPosition = 1; 
		String zero="0";
		if(num==0)
			return digitPosition;
		else {
			for(int i=1;i<=(num-1); i++){
				zero=zero+0;
			}
			zero = 1+zero;
			digitPosition = Integer.parseInt(zero);
			return digitPosition;
		}
	}

}
