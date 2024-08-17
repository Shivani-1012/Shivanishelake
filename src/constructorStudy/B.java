package constructorStudy;

public class B extends A {
	
	public B(int b)
	{ 
		super(30); //Calling super class constructor in sub class constructor
		System.out.println("Class B constructor"+b);
	}
	

	public static void main(String[] args) {
		
		B b=new B(20);

	}

}
