package threadMethods;

public class DemoMethods {

	public static void main(String[] args) {
		Thread t1 = new Thread();
		
//							methods
//		return type is long
		System.out.println("Thread Id : "+t1.getId());
		
//		return type is String
		System.out.println("thread Name : "+t1.getName());
		
//		return type is int
		System.out.println("Thread Priority : "+t1.getPriority());
		
		t1.setName("Rick");
		System.out.println("Updated Thread Name : "+t1.getName());
		
		t1.setPriority(10);
		System.out.println("Thread Priority : "+t1.getPriority());
		
//							constructors	
		
		Thread t2 = new Thread();	// no argument constructor
		Thread t3 = new Thread("TYSS");
		System.out.println("New Thread Name : "+t3.getName());
	}
}
