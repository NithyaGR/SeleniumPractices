package inteviewPracticePrograms;

import java.util.Scanner;

public class FactorsOfGivenNo {

	public static void main(String[] args) {
		// TO find the factors of given number
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive no");
		int num = sc.nextInt();
		System.out.println("The facotors are: ");
		System.out.println("The factor is 1");
		for(int i=2; i<=num/2; i++){
			int r = num%i;
			if (r == 0){
				System.out.println("The factor is "+i);
			}
		}
		System.out.println("The factor is "+num);
		sc.close();

	}

}
