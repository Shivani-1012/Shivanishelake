package methodStudy;

public class StudentInfo {

	public static void main(String[] args) {
		//ClassName objectName = new ClassName();
		
		StudentInfo info = new StudentInfo();

		//objectName.methodName();
		info.displayInformation();
		info.displayInformation("Aarti",30,45.2f,'B',80.8f,true);
		info.displayInformation("Akshay", 70, 32, 'C', 90, true);

	}
     public void displayInformation() {
    	 //name,rolNum,age,div,%marks,result
    	 
    	 String name ="Shivani";
    	 int rollNum = 65;
    	 float age = 20.9f;
    	 char div = 'A';
    	 float marks = 90.90f;
    	 boolean result = true;
    	 
    	 System.out.println("=========================================");
    	 System.out.println("Student's name is "+name);
    	 System.out.println("Student's roll number is "+rollNum);
    	 System.out.println("Student's age is "+age);
    	 System.out.println("Student's div is "+div);
    	 System.out.println("Student's marks is "+marks+"%");
    	 System.out.println("Student's result is "+result);
    	 
    	 System.out.println("=========================================");
    	  
     }
           // String name ="Shivani";
	      //  int rollNum = 65;
	      //  float age = 20.9f;
	     //   char div = 'A';
	    //    float marks = 90.90f;
	   //     boolean result = true;
     
        //Method with parameters or parameterized method
        public void displayInformation(String name,int rollNum,float age,char div,float marks ,boolean result) 
        {
        	System.out.println("Students name is "+name);
        	System.out.println("Students rollNum is "+rollNum);
        	System.out.println("Students age is "+age);
        	System.out.println("Students div is "+div);
        	System.out.println("Students marks are "+marks);
        	System.out.println("Students result is "+result);
        	
        	System.out.println("==================================================");
        }
        
	 
     
}
