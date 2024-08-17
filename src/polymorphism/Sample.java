package polymorphism;

public class Sample {
	
	public static void main(String[] args) {
		Sample sample=new Sample();
		sample.sum();
		sample.sum(1,2);
	}
		
	
	public void sum()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("sum is "+sum);	
	}
	
	public void sum(int a,int b)
	{
		int sum=a+b;
		System.out.println("sum is "+sum);
	}

}
