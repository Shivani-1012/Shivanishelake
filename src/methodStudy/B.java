package methodStudy;

public class B {

	public static void main(String[] args) {
		//To create object then follow syntax
		//ClassName objectName = new ClassName();
		B b = new B();
		
		//To call non static method from same class
		//objectName.methodName();
		b.method2();
		b.method2();

		//To call non static method from another class-->crate an object of that class
		//to call marathi method from students class,we need to create object of Students
		Students hindi = new Students();//created object of another class 
		
		//to call non static method from another class
		//objectName.methodName();
        hindi.marathi();
        hindi.marathi();
	}
	
	public void method2()
	{
		System.out.println("This is non static method");
	}

}
