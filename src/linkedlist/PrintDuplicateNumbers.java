package linkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {
		ArrayList<Integer> arrayLists = new ArrayList<>(Arrays.asList(1,1,3,4,6,5,7,3,4,8,6,9,10,3,5,10,10));
		HashSet<Integer> hCheckSet = new HashSet<>();
		HashSet<Integer> hInsertDuplicate = new HashSet<>();
		for (int integer: arrayLists) {
			if (!hCheckSet.add(integer)) {
				hInsertDuplicate.add(integer);
			}
		}
		System.out.println("Duplicate elements in given array: " + hInsertDuplicate);
	}

}
