package constructorStudy;

public class CS1 {
	 
	public CS1()
	{
		System.out.println("without parameter cnstructor");
	}
	
	public CS1(int a)
	{
		System.out.println("with parameter constructor "+a);
	}
	
	public CS1(String a)
	{
		System.out.println("with parameter constructor "+a);
	}

	public static void main(String[] args) {
		CS1 cs1=new CS1();
		CS1 cs2=new CS1(20);
		CS1 cs3=new CS1("Shivani");
		

	}

}
