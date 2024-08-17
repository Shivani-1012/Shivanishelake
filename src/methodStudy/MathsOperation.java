package methodStudy;

public class MathsOperation {

	public static void main(String[] args) {
		
       MathsOperation mo = new MathsOperation();
       mo.addition(); //Calling method without parameter
       mo.addition(4,7); //Calling method with parameter
       mo.addition(1,2); //Calling method without parameter
       subtraction(); //Calling method without parameter
       subtraction(10,5); //Calling method with parameter
       subtraction(5,4);//Calling method with parameter
       
	}
    
	public void addition() //Method without parameter
	{
		int a=30;
		int b=20;
		int sum=a+b;
		System.out.println("Addition is "+sum);
	}
	
	public void addition(int a,int b)
	{
		int sum=a+b;
		System.out.println("Addition is "+sum);
	}
	
	public static void subtraction() //Method without parameter
	{
		int x=80;
		int y=70;
		int sub=x-y;
		System.out.println("Substraction is "+sub);
	}
	
	public static void subtraction(int x,int y) //Method with parameter
	{
		int sub=x-y;
		System.out.println("Subtraction is "+sub);
	}
	
	
	
}
