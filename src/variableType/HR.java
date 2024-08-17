package variableType;

public class HR {

	public static void main(String[] args) {
		
		Employee Pratik = new Employee(); //created object of employee class
		 
		Pratik.empName = "Pratik Shelake";
		Pratik.empId = 30;
		Pratik.empGender = 'M';
		Pratik.empSalary = 345.12f;
		
		Employee Akshay = new Employee();
		
		Akshay.empName = "Akshay Randive";
		Akshay.empId = 40;
		Akshay.empGender = 'M';
		Akshay.empSalary = 12000.123f;
		
		//Call method
		//objectName.methodName();
		
		Pratik.empInfo();
		
		Akshay.empInfo();
	}

}
