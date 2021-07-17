package practiceAssignments;

public class ThreadDemo2 implements Runnable {

	public static void main(String[] args) {
		ThreadDemo2 obj = new ThreadDemo2();
		Thread thread = new Thread(obj);
		thread.start();
		System.out.println("This code in running outside the thread");
	}
	public void run(){
		System.out.println("This code is running in the thread");
	}
}
