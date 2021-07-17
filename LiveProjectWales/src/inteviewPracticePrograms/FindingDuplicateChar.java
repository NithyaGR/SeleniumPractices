package inteviewPracticePrograms;

public class FindingDuplicateChar {
	
	public void DuplicateChar(String str){
		
		String s = str.toLowerCase();
		//int length = s.length();
		
		char temp = s.charAt(0);
		//char[] letters = new char[length];
		//int[] ascii = new int[length];
		for(int i=0;i<s.length();i++){
			int count=0;
			
			for(int j=0;j<s.length();j++){
			
				if(temp==s.charAt(j)){
					count++;
					if (count>1){System.out.println(temp +" is found "+count+ " times");}
					
				}
			}	
			temp=s.charAt((i+1));
			s=s.substring((i+1));
			
			
		}
		
		
	}
	public void DupChar(String str){
		
		//System.out.println(str.length());
		do{
		//System.out.println("length of the substring is "+str.length());
		printDup(str);
		str=str.substring(1,str.length());
		//System.out.println("length of the substring is "+str.length());
		//System.out.println(str);
		} 
		while(!(str.length()==1));
		
		
	}
	public static void printDup(String s){
		int count=0;
		char temp = s.charAt(0);
		for(int i=0;i<s.length();i++){
			if(temp==s.charAt(i)){
				count++;
				if(count>1){System.out.println(temp+" is found "+count+" times.");}
			}
		}
		
	}

	public static void main(String[] args) {
	
	  FindingDuplicateChar obj = new FindingDuplicateChar();
	  //obj.DuplicateChar("sunsweet");
	  obj.DupChar("sunsweet");

	}

}
