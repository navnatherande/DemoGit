package Arraylistmethod;

import java.util.ArrayList;

public class increase_the_current_capacity_of_an_ArrayList {
	
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		//Now 'list' can hold 10 elements (Default Initial Capacity)
		list.ensureCapacity(20);
		//now ensureCapacity increase 20
	}

}
