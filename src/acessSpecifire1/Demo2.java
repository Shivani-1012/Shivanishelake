package acessSpecifire1;

import accessSpecifire.Demo;

public class Demo2 extends Demo {

	public static void main(String[] args) {
		Demo demo1=new Demo();
		 //demo1.test1(); //Calling private method in another package is not allowed
		
		//demo1.test2(); //Calling default method in another package is not allowed
		
		//demo1.test3();
		
		Demo2 demo2 =new Demo2(); //Calling protected method from another package
		demo2.test3();
		//We have to inheritance concept-->call using child class object
		
		demo1.test4(); //Calling public method from another package
		
		
		
		
		
		

	}

}
