package Arraylistmethod;

import java.util.ArrayList;
import java.util.List;

public class Arraylisthaking_program {
public  static void m1(List<Integer> list1,List<Integer> list2)
{
	list1=new ArrayList<Integer>();
	list1.add(10);
	list1.add(20);
	list2=new ArrayList<Integer>();
	
	Object[] obj=list1.toArray();
	for(Object s:obj)
	{
		System.out.println(s);
	}
}
public static void main(String[] args) {
	m1(null, null);
}
}
