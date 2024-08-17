package methodStudy;

public class Students {

	public static void main(String[] args) {
		
		// To call non static method we need to create object,below is syntax to create
		// object
		// ClassName objectName = new ClassName();
		
		Students pass = new Students(); // Created pass object
		
		//how to call non static method
		//objectNmae.methodName();
		
		pass.marathi();
		
		//calling static method from same class
		english();
		
		

	}
	
	public static void english()//static method
	{
		System.out.println("English is static method from same class");
	}
	
	public void marathi() //non static method
	{
	System.out.println("Marathi is non static method from same class");
	}

}
