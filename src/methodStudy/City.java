package methodStudy;

public class City {

	public static void main(String[] args) {
		// To call non static method we need to create object below is syntax to create
	    //  object
		//ClassName objectName = new ClassName();
		
		City kolhapur = new City();	//Created kolhapur object
		
		//how to call non static method
		//objectName.methodName();
		
		kolhapur.kodoli(); // calling non static method from same class
		vathar(); //calling static method from same class
	
	}
	
	public static void vathar() //static method
	{
		System.out.println("vathar is static method from City class");
	}
	
	public void kodoli() //non static method
	{
		System.out.println("kodoli is non static method from City class");
	}
	
	

}
