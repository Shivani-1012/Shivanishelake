package methodStudy;

public class Sample {

	public static void main(String[] args) {
		
		System.out.println("main method running");
		test2();
		System.out.println("main method finished");
		
		
		//calling static regular method from another class
		//syntax-->ClassName.methodName();
		Demo.display2();
		Demo.display();
		Main.show();
		Main.show2();

	}
        public static void test()
        {
        	System.out.println("This is test static regular method");
        	
        }
        public static void test2()
        {
        	System.out.println("This is test2 static regular method");
        }
        
}
