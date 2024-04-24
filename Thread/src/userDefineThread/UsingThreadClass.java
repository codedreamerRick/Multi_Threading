package userDefineThread;

public class UsingThreadClass extends Thread {

	@Override
	 public void run() 
	{
		for (int i = 1; i <= 20; i++) 
		{
			if(i % 2 == 1)
			{
				System.out.println("Odd : "+i);
				try
				{
					Thread.sleep(1000);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		UsingThreadClass t1 = new UsingThreadClass();
		Even t2 = new Even();
		t1.start();
		t2.start();
	}
}

class Even extends Thread
{
	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) 
		{
			if(i % 2 == 0)
			{
				System.out.println("Even : "+i);
				try
				{
					Thread.sleep(1000);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
	}
}
