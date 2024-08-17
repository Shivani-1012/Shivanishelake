package constructorStudy;

public class CS2 {
       //  public CS2()  //default constructor
	   //	{
	   //	//given b compiler-->at the time of compilation
	  //    }
		    
		    public CS2() //user defined-->without parameter/zero parameter constructor
		    {
		    	System.out.println("without parameter constructor");
		    }
		    
		    public CS2(int a)  //user defined-->with parameter/single parameter
		    {
		    	System.out.println("With parameter constructor "+a);
		    }
		    
		    public CS2(String a) //user defined-->with parameter/single parameter
		    {
		    	System.out.println("With parameter constructor "+a);
		    }
		    
		    public CS2(int a,int b) //user defined-->with parameter/two parameter
		    {
		    	System.out.println("with parameter constructor "+a+""+b);
		    }
		    
		    
	public static void main(String[] args) {
		int a; //variable declaration
		a=10;  //variable initialization
		
	    CS2 b; //variable declaration
		b=new CS2(); //variable initialization
		
		CS1 cs1 = new CS1(); //Calling without parameter constructor
		CS1 cs2 = new CS1(20); //Calling with parameter constructor of int type
		CS1 cs3 = new CS1("Shivani"); //Calling with parameter constructor of string type
	   
	}

}
