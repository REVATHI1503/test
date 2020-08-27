package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class duplicate {
public static void main(String args[]) {
	List list=new ArrayList();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(4);
	System.out.println(list);
	List list1=new ArrayList();
	list1.add(1);
	list1.add(2);
	list1.add(3);
	list1.add(4);
	list1.add(4);
list1.addAll(list);	
System.out.println(list1);
	Set s=new HashSet(list1);
	System.out.println(s);
	
	
	
}
}
