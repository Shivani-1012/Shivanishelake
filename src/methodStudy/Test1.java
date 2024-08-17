package methodStudy;

public class Test1 {

	public static void main(String[] args) //This is main method
	{
		System.out.println("main method running");
		
		//I want call static regular method from same class
		//methodName();
		m1();
		
		//I want call non static regular method from same class
		//we need object from same class
		//ClassName objectName = new ClassName();
		Test1 test1 = new Test1(); //created object of Test1 class
		 
	    //how to call non static regular method from same class
		//objectName.methodName
		test1.m2();
		
        System.out.println("======================================================================");
        
        //Calling static method from another class
        //ClassName.methodName();
        Test2.m3();
        
        //Calling non static method from another class
        //we need object from the class whose method want to call
        Test2 test2 = new Test2();
        
        //how to call non static regular method
        //objectName.methodName();
        test2.m4();//calling non static method from another class
        
        System.out.println("main method stopped");
		
	}
	
	 //static, non static regular method
	
	public static void m1()
	{
		System.out.println("This static regular m1 method from Test1 class");
	}
	
	public void m2()
	{
		System.out.println("This is non static regular m2 method from Test1 class");
	}
	

}
