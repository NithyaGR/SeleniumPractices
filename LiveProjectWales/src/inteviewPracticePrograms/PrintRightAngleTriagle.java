package inteviewPracticePrograms;

import java.util.Scanner;

public class PrintRightAngleTriagle {

	public static void main(String[] args) {
		// TO Print a right angle triangle
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base of the triagle");
		int base = sc.nextInt();
		for (int i=1; i<=base; i++){
			for (int j=1;j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
		

	}

}
