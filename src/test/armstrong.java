package test;

public class armstrong {
		 
	      public static void main(String args[]) {                      
	 
	      int num = 153;                   
	 
	      int n = num;
	 
	      int check = 0, remainder;
	 
	      while (num > 0) {
	 
	          remainder = num % 10;
	 
	          check = check + remainder*remainder*remainder;
	 
	          num = num / 10;
	 
	         }
	 
	      if (check == n)
	 
	        System.out.println(n + " is an Armstrong Number");
	      else
	 
	        System.out.println(n + " Not a Armstrong Number");
	      }
	
}
