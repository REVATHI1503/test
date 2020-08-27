package test;

public class count {
public static void main (String args[]) {
	String name="REVATHI DANGETI";
	int count=0;
	for(int i=0; i<name.length(); i++) {
	if(name.charAt(i)=='I') {
		count++;
		}
	}
	System.out.println(count);
	}
}
