package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SORT {
public static void main(String args[]) {
	List list=new ArrayList();
	list.add("b");
	list.add("e");
	list.add("d");
	list.add("a");
	System.out.println(list);
	Collections.sort(list);
	System.out.println(list);
}
}
