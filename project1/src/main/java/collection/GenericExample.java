package collection;

import java.util.ArrayList;

public class GenericExample {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(32);//add elements to the array
		al.add(56);
		al.add(45);
		al.add(101);
		System.out.println(al);
		al.remove(0);//remove elements from the list
		System.out.println(al);
		int length = al.size();//find the length
		System.out.println(length);
		boolean b = al.contains(45);
		System.out.println(b);
		System.out.println(al.get(2));//get value
		al.removeAll(al);//remove all elements from the list
		System.out.println(al);
	}

}
