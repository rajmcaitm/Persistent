package programs1;

import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(reverselinkedList(list));
		System.out.println(removeValueFromList(list, 30));
	}

	public static List<Integer> reverselinkedList(List<Integer> list) {

		List<Integer> reverse = new LinkedList<>();
		for (int i = list.size()-1; i >= 0; i--) {
			reverse.add(list.get(i));
		}

		return reverse;

	}
	
	public static List<Integer> removeValueFromList(List<Integer> list, Integer value) {

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == value) {
				list.remove(i);	
				}
		}
		return list;

	}
	

}
