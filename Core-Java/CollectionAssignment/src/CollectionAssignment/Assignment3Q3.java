package CollectionAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Assignment3Q3 {
	public static List<Integer> traverseReverse(ArrayList<Integer> aList) {
		ArrayList<Integer> sortedList = new ArrayList<Integer>();
		ListIterator<Integer> Itr = aList.listIterator(aList.size());
		while(Itr.hasPrevious()) {
			sortedList.add(Itr.previous());
		}
		return sortedList;
	}

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(50);
		arrayList.add(70);
		arrayList.add(90);
		
		System.out.println(traverseReverse(arrayList));

	}

}
