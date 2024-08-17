package LogicalPrograms;

import java.util.*;

public class Duplicate_Element {
	
	public static void main(String[] args) 
	{
		
		int arr[]= {1,2,3,4,5,6,1,8,9,3};
		int count=0;
		Arrays.sort(arr);
	    System.out.println(Arrays.toString(arr));
	       
	    if(arr[0]==arr[1]){
	           count++; //count=1,2
	       }
	       for(int i =1; i<arr.length-1;i++){
	           
	           if(arr[i-1]!=arr[i+1]){
	               if(arr[i]==arr[i+1])
	                  count++;
	           }
	       }
	    
	          System.out.println(count);

		
	}

}
