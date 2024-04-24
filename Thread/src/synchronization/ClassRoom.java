package synchronization;

public class ClassRoom {

	public static void main(String[] args) 
	{
		Trainer t = new Trainer();
		Student s = new Student("Rick", t);
		Student s1 = new Student("Mahan", t);
		Student s2 = new Student("Hari", t);
		
		s.start();
		s1.start();
		s2.start();
	}
}
  