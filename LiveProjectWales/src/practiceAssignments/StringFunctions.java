package practiceAssignments;

public class StringFunctions {

	public static void main(String[] args) {
		
		String s = Integer.toString(500);
		System.out.println(s);
		int i = Integer.parseInt("5000");
		System.out.println(i);
		StringFunctions oldsf = new StringFunctions();
		//StringFunctions newsf = new StringFunctions();
		StringFunctions oldsfRef = oldsf;
		System.out.println(oldsf);
		System.out.println(oldsf.hashCode());
		System.out.println(oldsfRef);
		System.out.println(oldsfRef.hashCode());
		

	}

}
