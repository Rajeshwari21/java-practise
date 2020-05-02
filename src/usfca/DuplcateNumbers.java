package usfca;

import java.util.HashMap;

public class DuplcateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 6, 9, 8, 1, 3, 5, 9, 2, 1, 5, 8, 3, 2, 4, 7, 10, 9, 1};
		System.out.println("Duplicate Numbers in the given array list are:");
		HashMap<Integer, Integer> list = new HashMap<>();
		for(int integer : arr) {
			if (list.containsKey(integer)) {
				list.put(integer, list.get(integer)+1);
			} else {
				list.put(integer, 1);
			}
		}
		list.forEach((key,value) -> {
			if (value > 1) {
				System.out.println(key + " - " + value + " times");
			}
		});	
	}

}
