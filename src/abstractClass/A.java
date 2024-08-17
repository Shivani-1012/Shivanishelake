package abstractClass;

public abstract class A //class became abstract class
{
	
	public static void main(String args[]) {
		//A a =new A();//we can't create object of this abstraction class
	}
	
	public void test1()
	{
		System.out.println("test1 method");
	}
	
	public void test2()
	{
		System.out.println("test2 method");
	}

	
	public abstract void test4();
	
	public abstract void test5();
	

}
