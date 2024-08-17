package thisAndSuper;

public class B extends A
{
	int x=1; //Global variable from B class(sub class)
	int y=20;

	public static void main(String[] args) {
      
		B b=new B();
		b.Demo2();

	}
	
	public void Demo2()
	{
		int x=2; //Local value fr5om B class(sub class)
		
		int sum1=100+1; //Used local value of x
		System.out.println(sum1);
		
		int sum2=100+this.x; //Used global value of x from B class(subclass)
		System.out.println(sum2);
		
		int sum3=100+super.x; //Used super class global value of x from A class(superclass)
		System.out.println(sum3);
		 
		int sum4=100+y; //Used super class global variable
		//As there is no y variable in sub class.there is no need of super keyword
		System.out.println(sum4); 
	}

}
