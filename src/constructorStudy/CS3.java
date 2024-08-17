package constructorStudy;

public class CS3 {
	int a =10;
	int b = 20;
	
	//variable initialization
	 public CS3(){
		a=90; //Initializing variables using zero parameter constructor
	    b=100;
	}
	
	public CS3(int x,int y) //Initializing variables using two parameter constructor
	{
		a=x; //2
		b=y; //2
	}
	
	public static void main(String[] args) {
	CS3 cs = new CS3(); //initialized object using zero parameter constructor
	cs.addition(); //This object will call zero parameter constructor and initializes variable
	
    CS3 cs1 = new CS3(2,2); //initialized object using zero parameter constructor
    cs1.addition(); //This object will call two parameter constructor and initializes variable
    
    CS3 cs2 = new CS3();
    cs2.addition();
    
    CS3 cs3 = new CS3(20,40);
    cs3.addition();
    
	}
	
	public void addition() //non regular static method
	{
		int sum =a+b;
		System.out.println("Sum is "+sum);
	}

}
