package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class maxarray {
	 public static void main(String a[]){
	        int nums[] = {1,5,4,2};
	        int maxOne = 0;
	        int maxTwo = 0;
	        for(int n:nums){
	            if(maxOne < n){
	                maxTwo = maxOne;
	                maxOne =n;
	            } else if(maxTwo < n){
	                maxTwo = n;
	            }
	        }
	        System.out.println("First Max Number: "+maxOne);
	        System.out.println("Second Max Number: "+maxTwo);
	    }
	     
	
	    }
	