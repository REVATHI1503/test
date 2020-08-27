package test;

import java.io.BufferedReader;
import java.io.FileReader;

public class Findingwords {

    public static void main (String args[]) throws Exception {

       System.out.println ("Counting Words");       
       FileReader fr = new FileReader ("D:\\Revathi\\Document.txt");        
       BufferedReader br = new BufferedReader (fr);     
       String line = br.readLine();
       int count = 0;
          String []parts = line.split(" ");
          for( String w : parts)
          {
        	  if(w.equalsIgnoreCase("rev")) {
            count++;        
          }
        	  }
      System.out.println(count);
    }
}

