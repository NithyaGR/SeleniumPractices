package inteviewPracticePrograms;

import java.util.Scanner;

public class PrintRectangle {

	public static void main(String[] args) {
		// Print a rectangle
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of a rectangle");
		int length = sc.nextInt();
		System.out.println("Enter breadth of this rectangle");
		int breadth = sc.nextInt();
		for(int i=1; i<=breadth; i++){
			for (int j=1; j<=length; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
