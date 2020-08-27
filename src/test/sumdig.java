package test;

public class sumdig {
public static void main(String args[]) {
	int number=153; int m,sum=0;
	while(number>0) {
		 m=number%10;
		 sum=sum+m;
		number=number/10;
	}
	System.out.println(sum);
}
}
