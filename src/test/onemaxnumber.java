package test;

public class onemaxnumber {
    public static void main(String a[]){
    	int maxOne = 0;
		 int nums[] = {5,34,78,2,45,1,100,23};
		     
		        for(int n:nums){
		            if(maxOne < n){
		           
		                maxOne =n;
		            } 
		        }
		        System.out.println("First Max Number: "+maxOne);
		}
		   }
		

