package test;

public class removespace {
	  public static void main(String args[])
	   {
	        String str;
	        int i;
	      str="ghj hghjg   hghj ghj gh gguihghj ";
	        char[] strArray = str.toCharArray();
	 
	        StringBuffer sb = new StringBuffer();
	 
	        for (i = 0; i < strArray.length; i++)
	        {
	            if( (strArray[i] != ' ') && (strArray[i] != '\t') )
	            {
	                sb.append(strArray[i]);
	            }
	        }
	 
	        System.out.println(sb); 
	   }
	}

