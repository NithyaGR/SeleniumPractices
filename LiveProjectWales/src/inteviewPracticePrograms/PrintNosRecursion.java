package inteviewPracticePrograms;

public class PrintNosRecursion {
	static int count = 0;
	public static void printNo(){
		
		count++;
		if(count<=10){
			System.out.println(count);
			printNo();
		}
	}

	public static void main(String[] args) {
			printNo();
	}

}
