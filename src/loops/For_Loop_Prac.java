package loops;

public class For_Loop_Prac {

	public static void main(String[] args) {
		// I want to write table of 5
		//Start--> Initialization 5
		//Condition--> i<=50
		//Interval--> updation--> i=i+5
		
		for(int i=5;i<=50;i=i+5)
		{
			System.out.println(i);
		}
		
		System.out.println("===============");
		//Start--> Initialization 50
		//Condition--> i>=5
		//Interval--> updation--> i=i-5
		
		for(int i=50;i>=5;i=i-5)
		{
			System.out.println(i);
		}

		

	}

}
