package thisAndSuper;

public class A {
	
	int x=99; //Global variable from A class
	
	
	public static void main(String args[]) {
		A a=new A();
		a.Demo1();
		
	}
	
	public void Demo1()
	{
		int x=10; //Local variable fromA class
		
		int sum=100+this.x; //use global value of x using this keyword
		System.out.println(sum);
		
		int sub=100-x;
		System.out.println(sub); 
	}

}
