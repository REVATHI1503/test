package test;
public class overload {
	 public void Java() {
		 
         System.out.println("Java1()");
         }
 
    public void Java(int i) {
 
         System.out.println("Java2(int i)");
    }
 
    public void Java(int i, int j) {
 
         System.out.println("Java3(int i, int j)");
    }
 
    public void Java(int i, int j, int k) {
 
         System.out.println("Java4(int i, int j, int k)");
    }           
   public static void main(String[] args) {
 
    	overload obj = new overload();
 
         obj.Java();
 
         obj.Java(7);
 
         obj.Java(7,8);           
 
         obj.Java(7,8,10);
 
    }
}

