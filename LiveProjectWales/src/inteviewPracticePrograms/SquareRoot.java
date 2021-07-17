package inteviewPracticePrograms;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		
		double a,b,c,d,e,f,s,area;
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		b = Math.sqrt(a);
		System.out.println(b);
		
		System.out.println("Enter a for ax^2+bx+c");
		a = sc.nextDouble();
		System.out.println("Enter b for ax^2+bx+c");
		b = sc.nextDouble();
		System.out.println("Enter c for ax^2+bx+c");
		c = sc.nextDouble();
		f = Math.sqrt((b*b)-(4*a*c));
		System.out.println(f);
		d = (-b+f)/(2*a);
		e = (-b-f)/(2*a);
		System.out.println("Roots of the given quadratic equations are: "+d+" "+e);
		
		System.out.println("Enter the side 1 of a scalene triangle");
		a = sc.nextDouble();
		System.out.println("Enter the side 2 of a scalene triangle");
		b = sc.nextDouble();
		System.out.println("Enter the side 3 of a scalene triangle");
		c = sc.nextDouble();
		s = (a+b+c)/2;
		area = Math.sqrt(s*(s-a)*(s-b));
		System.out.println("Area of the given triangle is "+area);
						
		sc.close();
		
		

	}

}
