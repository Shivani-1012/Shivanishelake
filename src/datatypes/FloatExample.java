package datatypes;

public class FloatExample {

	public static void main(String[] args) {
		
		//I want to store speed(should consider decimal values)
		//decimal--> 2 options-->float,double
		
		float speed; //variable declaration
		speed=100.12345678f; //variable initialization
		System.out.println(speed); //variable usage
		System.out.println("My speed is "+speed);
        
		//this is 100.99 KM/H
		
		System.out.println("this is "+speed+" KM/H");
		
		//I want to store gold weight(should consider decimal values)
		
		double weight; //variable declaration
		weight=9.12345678976812345d; //variable initialization
		System.out.println(weight);
		System.out.println("My weight is "+weight);
		System.out.println("My weight is "+weight+" kg");
	}

}
 