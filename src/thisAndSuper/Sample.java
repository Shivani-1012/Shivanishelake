package thisAndSuper;

public class Sample {
     
	int a=10; //Global variable
	
	public static void main(String[] args) {
		
		Sample sample=new Sample();
		sample.add();
	

	}
	
	public void add() 
	{
	int a=20; //Local variable
	int sum=a+100;
	System.out.println(sum);
	
	int sum1=this.a+50;
	System.out.println(sum1);
			
	}
	

}
