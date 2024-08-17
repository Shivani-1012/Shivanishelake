package methodStudy;

public class A {

	public static void main(String[] args) {
      //To create object then follow syntax
	 //ClassName objectName = new ClassName();
		
		A a = new A(); //created object from A class
        //To call non static method from same class
		//objectName.methodName();
		a.method1();
		
		//To call non static method from another class-->create an object of that class
		//To call kodoli method from city class,we need to create object of city
		//class
		
		City karad = new City(); //created object of another class
		//To call static method from another class
		//objectName.methodName();
		karad.kodoli();
	}
	
	public void method1()
	{
		System.out.println("This is non static method1");
	}

}
