package accessSpecifire;

public class Demo1 {

	public static void main(String[] args) {
		Demo demo1=new Demo(); 
		//demo1.test1 //Calling private method in another class is not allowed
        
		demo1.test2(); //Calling default method in another class
		
		demo1.test3(); //Calling protected method in another class
		
		demo1.test4(); //Calling public method in another class
		

		
	}

}
