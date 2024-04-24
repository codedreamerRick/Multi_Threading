package userDefineThread;

public class FlipkartDriver {
	
	public static void main(String[] args) 
	{
		
//		4 lines
		
		Flipkart f = new Flipkart();
		Thread t1 = new Thread(f);
		t1.setName("Rick1");
		System.out.println(t1.getName());
		t1.start();
		
//		3 lines
		
		Thread t2 = new Thread(new Flipkart());
		t2.setName("Rick2");
		System.out.println(t2.getName());
		t2.start();
		
//		2 lines
		
		Thread t3 = new Thread(new Flipkart(), "Rick3");
		System.out.println(t3.getName());
		t3.start();
		
//		1 line
		
		(new Thread(new Flipkart(), "Rick3")).start();
	}
}

class Flipkart implements Runnable
{
	@Override
	public void run() {
		System.out.println("Welcome");
		
	}
}