package inteviewPracticePrograms;

public class SumOfNumSq {

	public static void main(String[] args) {
		
		//Find the sum of 1^2, 2^2, 3^2,..10^2.)
		int sum =0, i=1;
		while(i<10){
			sum = sum+(i*i);
			i++;
		}
		System.out.println(sum);
		
	}
}
