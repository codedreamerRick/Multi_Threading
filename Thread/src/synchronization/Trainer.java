package synchronization;

public class Trainer {

	synchronized void askQuestions(String name)
	{
		System.out.println(name+" is asking a question");
		try 
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println(name+" has got the answer"); 
	}
}
