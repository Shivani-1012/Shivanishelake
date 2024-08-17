package loops;

public class Do_While_Loop {

	public static void main(String[] args) {
		// I want table of 10
		//Initialization-->10
		//Condition--> m<=100
		//Updation-->m=m+10
		
		int m=10;
		do
		{
			System.out.println(m);
			m=m+10;
		}
		while(m<=100);
		
		//Initialization-->100
		//Condition--> n>=10
		//Updation-->n=n-10
		
		System.out.println("===============");
		int n=100;
		do
		{
		 System.out.println(n);	
		 n=n-10;
		}
		while(n>=10);
		

	}

}
