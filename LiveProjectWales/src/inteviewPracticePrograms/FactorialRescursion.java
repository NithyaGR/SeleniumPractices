package inteviewPracticePrograms;

public class FactorialRescursion {
	static int count;
	static int temp=1;
	public static int factorialRecursion(int n){

		if(n==0){
			return 1;
		}
		else{
			return (n*factorialRecursion(n-1));
		}
	}

	public void factorial(int number){
		int num = 1;
		for(int i=1;i<=number;i++){
			num = num*i;
		}
		System.out.println(number+" Factorial is "+num);
	}
	public static void main(String[] args) {
		
		FactorialRescursion fr = new FactorialRescursion();
		System.out.println("Factorial is :"+factorialRecursion(4));
		fr.factorial(5);
		
	}
	

}
