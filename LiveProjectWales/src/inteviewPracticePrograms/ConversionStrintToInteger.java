package inteviewPracticePrograms;

public class ConversionStrintToInteger {
	public static void main(String[] args) {
		/**
		 * String is a class
		 * String is immutable 
		 * String is  a final Class cannot be extended
		 */
		String s= "1,23,507";//int 4 bytes long 8 bytes
		Integer i = Integer.parseInt(s.replace(",",""));
		System.out.println(i);
		s= i.toString();
		System.out.println(s);
		
		//String & StringBuilder differences
		String s1 ="abc";
		System.out.println("HashCode of s1 "+s1.hashCode());
		System.out.println(s1.concat("def"));
		System.out.println("Value of s1 after concating def is :"+s1);
		System.out.println("HashCode of s1 after concating def is : "+s1.hashCode());
		s1 = s1.concat("def");
		System.out.println("HashCode of s1 after concat "+s1.hashCode());
		s = "abc";
		System.out.println("HashCode of s "+s.hashCode());
		StringBuffer s2 = new StringBuffer("abc");
		System.out.println("HashCode of s2 "+s2.hashCode());
	    s2.append("def");
	    System.out.println("HashCode of s2 after append "+s2.hashCode());
		System.out.println("value of s2 "+s2);
		StringBuilder sb = new StringBuilder("abc");
		sb.append("def");
		System.out.println("value of sb "+sb);
		
		//Performance Check
		long startTime = System.currentTimeMillis();
		System.out.println(System.currentTimeMillis());
		StringBuffer sb1 = new StringBuffer("Hello");
		for (int j=0; j<1000; j++){
			sb1.append(" Java");
		}
		long endTime = System.currentTimeMillis();
		long time = endTime - startTime;
		System.out.println("Time taken by StringBuffer is "+time);
		
		startTime = System.currentTimeMillis();
		StringBuilder sb2 = new StringBuilder("Hello");
		for (int k=0; k<1000; k++){
			sb2.append(" Java");
		}
		endTime = System.currentTimeMillis();
		time = endTime-startTime;
		System.out.println("Time taken by String Biulder is "+time);
		
		
	}

}
