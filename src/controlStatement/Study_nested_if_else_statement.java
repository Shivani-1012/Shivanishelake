package controlStatement;

public class Study_nested_if_else_statement {

	public static void main(String[] args) {
		//Enter your Email id
		//if email id is correct,then enter our password
		//if password is correct,then login success
		//else password is incorrect
		//else email id is incorrect
		
		String emailId = "java@gmail.com";
		String password = "java@123";
		
		if(emailId=="java@gmail.com")
		{
			System.out.println("Email id is correct,please enter password");
			
			if(password=="java@123")
			{
				System.out.println("Password is correct,login success");
			}
			else
			{
				System.out.println("Password is incorrect");
			}
		}
		else
		{
			System.out.println("Email id is incorrect");
		}

	}

}
