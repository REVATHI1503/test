package test;

public class leapyear {
	public static void main(String args[]) {
		int year=2014;
if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
	System.out.println(year+" leap year");
}else{
		System.out.println(year+" not leap year");
		}
	}

}