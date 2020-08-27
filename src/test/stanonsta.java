package test;

public class stanonsta {

    int i=1;

    static int p=3;

    public void test1() {

    System.out.println("test 1 non static");
    }

    public static void test2() {

    System.out.println("test 2 static");
    }

public static void main(String[] args) {

	stanonsta obj = new stanonsta();

       obj.test1();
      System.out.println(obj.i);
      test2();
  System.out.println(p);
       
}
}
