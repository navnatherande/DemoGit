package Arraylist_Assendingorder;


import java.util.HashSet;

import java.util.Set;

public class Tast {
public static void main(String[] args) {
	Set<Student> list=new HashSet<Student>();
	
	Student s=new Student();
	System.out.println(s.hashCode());
	s.setName("Navnath");
	s.setRollno(1);
	Student s1=new Student();
	System.out.println(s1.hashCode());
	s1.setRollno(1);
	s1.setName("Navnath");
	list.add(s);
	list.add(s1);
	for(Student str:list)
	{
		System.out.println(str.getRollno()+" "+str.getName());
	}
}
}
