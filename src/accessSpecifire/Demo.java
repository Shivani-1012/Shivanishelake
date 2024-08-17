package accessSpecifire;

public class Demo {
	
	private int a=20;
	int b=30;
	protected int c=40;
	public int d=60;

	public static void main(String[] args) {
		Demo demo=new Demo();
		demo.test1(); //Calling private method within class
		System.out.println(demo.a); //Calling private global variable within class
		
		demo.test2(); //Calling default method within class
		System.out.println("demo.b"); //Calling default global variable within class
		
		demo.test3(); //Calling protected method within class
		System.out.println("demo.c");
		
		demo.test4(); //Calling public method within class
		System.out.println("demo.d");
		
		


	}
	private void test1()
	{
		System.out.println("This is Demo's private test1 method");
	}
	
	  void test2()
	{
		System.out.println("This is Demo's default test2 method");
	}
	  
	protected void test3()
	{
		System.out.println("This is Demo's protected test3 method");
	}
	public void test4()
	{
		System.out.println("This is Demo's public test4 method");
	}
	

}
