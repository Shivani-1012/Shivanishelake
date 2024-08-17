package variableType;

public class Sample1 {
	
	int x = 8; // non static global variable
	static int y = 10; //static global variable
	
	public static void main(String[] args) {
		//call global variable from same class
		//to call non static global variable--->need to create object of class
		//ojectName.variableName();
		Sample1 sample1 = new Sample1();
		System.out.println("Calling non static global variable "+sample1.x);
		
		//call static global variable
		//static variable from same class-->call just variable name
		System.out.println("Calling static global variable "+y);
		
		//call global variable from another same class
		//to call non static global variable from another class-->created object of that class
		Sample2 s2 = new Sample2(); //Created object of another class
		System.out.println("Calling non static global variable form another class "+s2.m);
		
		//to call static global variable from another class
		//className.variableNmae
		System.out.println("Calling static global variable form another class "+Sample2.n);
	}
	
	public void test1() //non static regular method
	{
		int sum = 20+x; //using global non static global variable in non static method
		int sub = 90-y; //using global static global variable in non static method
		System.out.println("Sum is "+sum);
		System.out.println("Sub is "+sub);
		
	}
	
	public static void test2() //static regular method
	{
		//int sum = 20+x;
		  int sub = 90-y;
	}
	
	

}
