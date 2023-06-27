package abstractionPrograms;

public abstract class AbstractionClassExample { //abstract class
	
	public void  setup() //non abstract class
	{
		System.out.println("This is non abstract methord setup");
	}
	
	public void teardown() {
		System.out.println("This is non abstract methord teardown");
	}
	
	public abstract void process();
	

}
