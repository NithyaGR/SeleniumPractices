package inteviewPracticePrograms;

import java.util.Scanner;

public class SumOfNNos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find the sum 1+2+3+...+n");
		int num = sc.nextInt();
		int sum =0, i=1;
		while (i<=num){
			sum = sum+i;
			i++;
		}
		System.out.println(sum);
		sc.close();
		
	}

}
