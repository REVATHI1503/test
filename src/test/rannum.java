package test;

import java.util.Random;
import java.util.Scanner;

public class rannum {
public static void main(String[] args) {
	 
	Random ran =  new Random();                       
	 
	Scanner sc = new Scanner(System.in);
	 
	System.out.println("How Random Numbers you want?:- ");
	int value = sc.nextInt();                       
	 
	for(int i=0; i<value;i++){
	 
	    int number = ran.nextInt(200);
	    System.out.println(number);
	    }
	  
	    }
	  }           
	 
	

