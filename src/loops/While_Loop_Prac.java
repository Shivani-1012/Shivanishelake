package loops;

public class While_Loop_Prac {

	public static void main(String[] args) {
		// I want to write table of 10
	    //Start--> Initialization 10
	   //Condition--> j<=100
	   //updation--> j=j+10
		
		int j=10;
		while(j<=100)
		{
			System.out.println(j);
			j=j+10;
		}
		
	    //Start--> Initialization 100
	    //Condition--> j>=10
	   //updation--> j=j-10
		System.out.println("==========");
		int k=100;
		while(k>=10)
		{
			System.out.println(k);
			k=k-10;
		}	

	}

}
