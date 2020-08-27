package test;

import java.util.Scanner;

public class test1 {
public static void main (String args[]) {
String s="rev is good";
	String [] word= s.split(" ");
	for(int i=word.length-1; i>=0; i--) {
String d=word[i];
System.out.print(d+"  ");
}
}
}