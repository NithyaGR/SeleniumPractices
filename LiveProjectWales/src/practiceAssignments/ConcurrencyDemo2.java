package practiceAssignments;

public class ConcurrencyDemo2 extends Thread{
	static int i;

	public static void main(String[] args) {
		ConcurrencyDemo2 obj = new ConcurrencyDemo2();
		obj.start();
		while(obj.isAlive()){
			System.out.println("Main is waiting.....");
		}
		System.out.println("Main ...... "+i);
		i++;
		System.out.println("Main ...... "+i);
	}
	public void run(){
		i++;
		System.out.println("Thread ..... "+i);
	}
}
