package SortingList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class ArraylistSort {

	
	public static void SortString()
	{
		int count=0;
		//TreeSet<String> tree=new TreeSet<String>();
		List<String> list1=new ArrayList<String>();
		List<String> list=new ArrayList<String>();
		list.add("Navnath Erande");
		list.add("Yogesh Kale");
		list.add("Abhijit magdum");
		list.add("Chetan mule");
		
		//System.out.println(list);
		for(String s:list)
		{
			
			//System.out.println(s);
			String[] str=s.split(" ");
			
			//System.out.println("-----------------------------");
			count =0;
			for(String s1:str)
			{
				count++;
				if(count == 2)
				{
					//System.out.println(s1);
					//tree.add(s1);
					list1.add(s1);
					
				}
			}
		}
		//System.out.println(tree);
		Collections.sort(list1);
		System.out.println(list1);
	}
	public static void main(String[] args) {
		SortString();
	}
}
