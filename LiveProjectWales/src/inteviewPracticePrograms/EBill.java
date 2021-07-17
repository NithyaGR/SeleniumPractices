package inteviewPracticePrograms;

import java.util.Scanner;

public class EBill {

	public static void main(String[] args) {

		int unit = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the current Unit");
		unit = sc.nextInt();
		int quotient = unit;
		int reminder = 0;
		
		do {
			quotient = quotient/10;
		}
		while(quotient>10);
		System.out.println("Quotient is :"+quotient);
		System.out.println("Unit is "+unit);
		reminder = unit%100;
		System.out.println("reminder is :"+reminder);
		int  amount=0;
		for(int i=1; i<=quotient;i++){
			amount = amount+(i*100);
		}
		System.out.println("Amount is :"+amount);
		if(quotient <4)
		   reminder = (quotient+1)*reminder;
		else
			reminder = quotient*reminder;
		
		int eBill = amount+reminder;
		System.out.println(eBill);
		
		if(unit>=1 && unit<=100){
			amount = unit;
		}
		else if (unit>=101 && unit<=200){
			amount = 100+( 2* (unit-100) );
		}
		else if (unit>=201 && unit<=300){
			amount = 100 + 200 + (3* (unit-200) );
		}
		else if (unit>=301 && unit<=400){
			amount = 100 + 200 + 300 + (4* (unit-300) );
		}
		else if (unit>=401){
			amount = 100 + 200 + 300 + 400 + (4 *(unit-400) );
		}
		System.out.println(amount);
		sc.close();

	}

}
