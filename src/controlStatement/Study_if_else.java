package controlStatement;

public class Study_if_else {

	public static void main(String[] args) {
		// if signal is red then stop
		// else go
		
		// Syntax
		// if(condition)
		// {
		//    block of code to be executed if the condition is true
		// }
		// else
		// {
		//     block of code to be executed if the condition is false
	    // }        

		
		String signal="green";
		 if(signal=="red")
		 {
			 System.out.println("Stop");
		 }
		 else
		 {
			 System.out.println("Go");
		 }
		 
		 //Example 2
		 //if marks are greater than or equal to 35 then you are pass
		 //else fail
		 
		 int marks = 30;
		 
		 if (marks>=35){
			 System.out.println("You are pass");	 
		 }
		 else
		 {
			 System.out.println("You are fail");
		 }
		 
		 //if you are male(m) then turn right
		 //else turn left
		 
		 String turn ="female";
		 
		 if(turn=="male")
		 {
			 System.out.println("You are male then turn right");
		 }
		 else 
		 {
			 System.out.println("Yor are not male then turn left");
		 }
		 
		 

	}

}
