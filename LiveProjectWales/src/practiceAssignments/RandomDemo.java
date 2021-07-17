package practiceAssignments;

import java.util.Random;

public class RandomDemo {

	Random rdm; 
	public void rdmNoOfDigits(int noOfDigits){
		rdm = new Random();
		int addend1=0, addend2=0; String zero ="";String bound = "";int result=0;
		for(int i=1;i<=(noOfDigits-1); i++){
			zero = zero+0;
		}
		zero = 1+zero;
		System.out.println(zero);
		addend1 = Integer.parseInt(zero);
		System.out.println(addend1);
		for (int j=1; j<=(noOfDigits-1); j++){
			bound = bound+9;
		}
		bound = 8+bound;
		System.out.println(bound);
		addend2 = Integer.parseInt(bound);
		System.out.println(addend2);
		result = addend1+ rdm.nextInt(addend2);
		System.out.println("Random "+noOfDigits+ " digit number is : "+result);
		
	}
	public void rdmTwoDigits(){
		rdm = new Random();
		int i = 10+rdm.nextInt(89);
		System.out.println(i);
	}
	public void rdm5Digits(){
		rdm = new Random();
		int i = 10000+rdm.nextInt(89999);
		System.out.println(i);

	}

	public void rdm8Digits(){
		rdm = new Random();
		int i = 10000000 + rdm.nextInt(89999999);
		System.out.println(i);
		
		
	}
	public void rdmUpperCaseletters(){
		rdm = new Random();
		int i = 65+rdm.nextInt(26);
		char ch = (char)i;
		System.out.println(ch);//type casting
		System.out.println(i);
	}
	public void rdmLowerCaseLetters(){
		rdm = new Random();
		int i = 97+rdm.nextInt(26);
		char ch = (char) i;
		System.out.println(ch); //type casting
		System.out.println(i);
	}
	public String getRandomString(){

		String s = "";
		int bound = 10;
		//char[] charArray = new char[bound];
		for(int i=0; i<bound; i++){
			char c = (char) ('a'+rdm.nextInt(26));
			s = s+c;
		}

		return s;
	}
	public static void generateRandom(int n, int range){
		String str = "";
		for(int j=0; j<n; j++)
		{
				str = str+ 9;	 
		}
		System.out.println(str);
		System.out.println(str+new Random().nextInt(range));
	}
	public static void getRandomNos(int n, int range ){
		
		System.out.println(1+(new Random().nextInt(range)));
	}
	public static void main(String[] args) {
		RandomDemo rd = new RandomDemo();
		rd.rdmTwoDigits();
		rd.rdm5Digits();
		rd.rdmUpperCaseletters();
		rd.rdmLowerCaseLetters();
		rd.rdm8Digits();
		System.out.println(rd.getRandomString());
		System.out.println("********************");
		generateRandom(2, 100);
		getRandomNos(2,3);
		rd.rdmNoOfDigits(3);
		rd.getRandomDoubleNos();
	}
	public void getRandomDoubleNos(){
	   rdm = new Random();
	   System.out.println("RandomDoubleNos is "+rdm.nextDouble());
	   System.out.println("RandomFloat is "+rdm.nextFloat());
	   System.out.println("RandomLong is "+rdm.nextLong());
	   
	
	}


}
