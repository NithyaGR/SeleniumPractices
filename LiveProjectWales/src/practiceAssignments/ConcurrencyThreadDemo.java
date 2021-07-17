package practiceAssignments;

public class ConcurrencyThreadDemo extends Thread {
	public static int i;

	public static void main(String[] args) {
		
		ConcurrencyThreadDemo obj = new ConcurrencyThreadDemo();
		obj.start();
		System.out.println("The main code "+i);
		i++;
		System.out.println("The main code "+i);
		}
	public void run(){
		i++;
		System.out.println("Thread code "+i);
	}

}
