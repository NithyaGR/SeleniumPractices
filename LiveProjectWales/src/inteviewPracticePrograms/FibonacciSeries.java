package inteviewPracticePrograms;

public class FibonacciSeries {
	
	int firstNo=1;
	int secondNo=1;
	int nextNo = 0;
	
	public void printSeries(int no){
		
		print(firstNo);
		print(secondNo);
		
		for(int i=0;i<(no-2);i++){
			nextNo = firstNo+secondNo;
			print(nextNo);
			firstNo = secondNo;
			secondNo = nextNo;
		}
	
	}
	public static void print(int i){
		System.out.print(i+", " );
	}

	public static void main(String[] args) {
		FibonacciSeries series = new FibonacciSeries();
		series.printSeries(10);

	}

}
