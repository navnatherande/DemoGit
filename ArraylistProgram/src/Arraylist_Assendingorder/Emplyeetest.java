package Arraylist_Assendingorder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TreeSet;


public class Emplyeetest {
	public static void main(String[] args) throws ParseException 
	{
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		 Date date = formatter.parse("31/03/2015");  
		Employee e=new Employee();
		e.setDate(date);
		e.setName("Dipali");
		
		 Employee e1=new Employee();
		 Date date1 = formatter.parse("15/03/2015"); 
		 e1.setDate(date1);
		 e1.setName("Navnath");
		
		 Employee e2=new Employee();
		 Date date2 = formatter.parse("10/03/2015"); 
		 e2.setDate(date2);
		 e2.setName("Navnath/Dipali");
		
		 
		TreeSet<Employee> t=new TreeSet<Employee>(new Mycomparater());
		t.add(e);
		t.add(e1);
		t.add(e2);
		
		for(Employee emp:t)
		{
			System.out.println(emp.getDate()+" "+emp.getName());
		}
		
	
	
	}

}
