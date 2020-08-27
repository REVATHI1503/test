package test;
public class power{
	
	public static void main(String args[]){
		int n=2,p=5,result=1;
		if(n==0) 
			result= 1;
		else if(n==1)
			result= n;
		else{
			 {
		         for(int i=1;i<=p;i++)
			 {
		            result=result*n;
		 	 }	    
		     }
		    System.out.println(n+"^"+p+"="+result);
			
		}
	}
}