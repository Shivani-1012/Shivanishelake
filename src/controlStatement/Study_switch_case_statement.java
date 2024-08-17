package controlStatement;

public class Study_switch_case_statement {

	public static void main(String[] args) {
		// days-->1,2,...7
		
		int day = 5;
		
		switch (day) {
		case 1:System.out.println("Today is sunday");
		break;
		
		case 2:System.out.println("Today is monday");
		break;
		
		case 3:System.out.println("Today is tuesday");
		break;
		
		case 4:System.out.println("Today is wednesday");
		break;
		
		case 5:System.out.println("Today is thursday");
		break;
		
		case 6:System.out.println("Today is friday");
		break;
		
		case 7:System.out.println("Today is saturday");
		break;
		
        default:System.out.println("Please enter value between 1 to 7");
		break;
		}

	}
	
	
}
