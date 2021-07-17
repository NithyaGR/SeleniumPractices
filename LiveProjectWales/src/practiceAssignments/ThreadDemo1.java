package practiceAssignments;

public class ThreadDemo1 extends Thread {

	public static void main(String[] args) {
		
		ThreadDemo1 obj = new ThreadDemo1();
		obj.start();
		System.out.println("This main code is running outside of the thread");
	}
	public void run(){
		System.out.println("This code is running in the thread");
	}

}
