package test;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class datepicker {
public static void main (String args[]) {
	DateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY");
	Date date = new Date();
	System.out.println(dateFormat.format(date)); 
String date1  = dateFormat.format(date).replaceAll("/", "");
System.out.println(date1);
}
}