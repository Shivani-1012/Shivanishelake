package constructorStudy;

public class CS4 {
	//Variable initialization
	  String a;
	  int b;
	  
	  //use of constructor to initialize variable
	  //user defined without parameter
	  public CS4() {
		 a="Kolhapur";
		 b=10;
	  }
	  
	  //use constructor to initialize variable
	  //user defined with parameter
	  public CS4(String x,int y) //Akshay 20
	  {
		  a = x;
		  b = y;
	  }
	  
	  public CS4(int n,String m) //30 Shivani
	  {
		  b=n;
		  a=m;
	  }
	  

	public static void main(String[] args) {
		CS4 cs1 = new CS4(); //created object using without parameter constructor
		cs1.display();
		
		CS4 cs2 = new CS4(); //created object using without parameter constructor

		cs2.display();
		
		CS4 cs3 = new CS4("Akshay",20); //created object using with two parameter constructor

		cs3.display();
		
		CS4 cs4 = new CS4(30,"Shivani"); //created object using with two parameter constructor

		cs4.display();
				
	}
	
	public void display() 
	{
		System.out.println("Value of a is "+a);
		System.out.println("Value of b is "+b);
	}	
	
}
