package datastuctures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		
		List<Integer> myFirstlist = new ArrayList<>();
		
		myFirstlist.add(1);
		myFirstlist.add(56);
		myFirstlist.add(98);
		myFirstlist.add(-175);
		myFirstlist.add(0);
		
		System.out.println("Size of the list: " + myFirstlist.size());
		
		for(int i = 0; i <myFirstlist.size(); i++) {
			System.out.println(myFirstlist.get(i).toString());
		}
		
		//sorting List 
		Collections.sort(myFirstlist);
		for(int i = 0; i <myFirstlist.size(); i++) {
			System.out.println(myFirstlist.get(i).toString());
		}
		
		//list methods
		myFirstlist.remove(0);
		
		for(int i = 0; i <myFirstlist.size(); i++) {
			System.out.println(myFirstlist.get(i).toString());
		}
		
	}

}
