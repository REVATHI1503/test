package test;

import java.util.*;
public class longsubreap {
    public static void main(String[] args) {
    	int max=0;
    String a="";
List<String> s=new ArrayList<String>();
s.add("gg");
s.add("jhk");
s.add("vbv");
s.add("gg");
Set set = new HashSet(s);
System.out.println(set);
String[] array = (String[]) set.toArray(new String[0]);
for(String d:array) {
	int l=	d.length();
	if(max<l) {
	max=l;
	}
	d=a;
System.out.println(a);
}

}
 
    }