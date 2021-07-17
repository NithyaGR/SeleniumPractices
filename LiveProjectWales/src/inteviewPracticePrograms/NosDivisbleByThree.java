package inteviewPracticePrograms;

public class NosDivisbleByThree {

	public static void main(String[] args) {
		// Print the numbers less than 100 divisible by 3 
		int i=3;
		while(i<100){
			System.out.print(" "+i);
			i = i+3;
		}
		System.out.println();
		int l=1, m=1;
		
		while (l<100){
			l = m*3;
			System.out.print(" "+l);
			m++;
		}
		System.out.println();
		for(int j=3;j<100;j=j+3){
			
			System.out.print(" "+j);
			
		}
		System.out.println();
		int k=3;
		do{
			System.out.print(" "+k);
			k=k+3;
		}
		while(k<100);

	}

}
