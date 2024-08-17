package methodStudy;

public class Calculator {
	
	int a = 10;// variable declaration+variable initialization
    int b = 90;// variable declaration+variable initialization		

	public static void main(String[] args) {
		//ClassName objectName = new ClassName();
		Calculator calculator = new Calculator();//create object
	    
		//objectName.methodName();
		calculator.addition();//Calling non static method
		calculator.substraction();//Calling non static method
		calculator.multiplication();//Calling non static method
		calculator.division();//Calling non static method

	}
	
	public void addition() //non static method
	{   
		int a = 100; //variable declaration & variable initialization
		int b = 90;  //variable declaration & variable initialization
		int sum = a+b;
		System.out.println("Addiion is " + sum); //variable usage	
	}
	
	public void substraction() //non static method
	{
//		int b = 100; //variable declaration & variable initialization
		int a = 90;  //variable declaration & variable initialization
		int sub = b-a;
		System.out.println("Substraction is " + sub); //variable usage	
	}
	
	public void multiplication()
	{   
		int a = 90; //variable declaration & variable initialization
		int b = 100; //variable declaration & variable initialization
		int mul = b*a;
		System.out.println("Multiplication is " + mul); //variable usage
	}
	
	public void division()
	{
		int a = 90; //variable declaration & variable initialization
		int b = 100; //variable declaration & variable initialization
		float div = b/a;
		float rem = a%b;
		System.out.println("Division is " + div); //variable usage
		System.out.println("Remainder is"+rem);
	}
	

}
