package controlStatement;

public class Study_else_if_statement {

	public static void main(String[] args) {
	//>=60-->1st class
	//>=50-->2nd class
	//>=40-->just pass
	//<40-->fail
		
	//if marks greater than or equal 60 then you are in first class
    //if marks greater than or equal 50 then you are in second class
    //if marks greater than or equal 40 then you just in pass class
	//else you are fail
		
		int marks = 30;
		if(marks>=50)
		{
			System.out.println("You are in first class");
		}
		else if(marks>=50)
		{
			System.out.println("You are in second class");
		}
		else if(marks>=40)
		{
			System.out.println("You just in pass class");
		}
		else
		{
			System.out.println("You are fail");
		}
		



	}

}
