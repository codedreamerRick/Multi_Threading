package synchronization;

public class Student extends Thread {

	String name;
	Trainer t;
	
	Student(String name, Trainer t)
	{
		this.name = name;
		this.t = t;
	}
	
	@Override
	public void run() 
	{
		t.askQuestions(name);
	}

}
