package inteviewPracticePrograms;

import java.util.Scanner;

public class ModulusOfNumber {

	public static void main(String[] args) {
		
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an intger");
		num = sc.nextInt();
		if (num<0){
			//num = 0-num;
			num = num *-1;
			
		}
		System.out.println("Modulus of given number is "+num);
		sc.close();
		

	}

}
