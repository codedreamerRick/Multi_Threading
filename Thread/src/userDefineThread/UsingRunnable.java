package userDefineThread;

public class UsingRunnable implements Runnable {

	@Override
	public void run() 
	{
		System.out.println("Hiii...!");
	}
	
	public static void main(String[] args) 
	{
		UsingRunnable u = new UsingRunnable();
		Thread t = new Thread(u);
		t.start();
	}
}
