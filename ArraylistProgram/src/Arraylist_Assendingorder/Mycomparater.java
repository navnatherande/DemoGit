package Arraylist_Assendingorder;

import java.util.Comparator;

public class Mycomparater implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		Employee emp1=(Employee)o1;
		Employee emp2=(Employee)o2;
		
		return emp1.getDate().compareTo(emp2.getDate());
	}

	

}
