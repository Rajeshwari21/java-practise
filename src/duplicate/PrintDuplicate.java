package duplicate;

import java.util.HashMap;

public class PrintDuplicate {

	public static void main(String[] args) {
		int[] arrs = {1, 2, 3, 1, 2, 4, 5, 2, 5, 6, 7, 5, 7, 5};
		System.out.println("Duplicate values are: ");
		HashMap<Integer, Integer> mapDuplicates = new HashMap<>();
		for (int arr: arrs) {
			if (mapDuplicates.containsKey(arr)) {
				mapDuplicates.put(arr, mapDuplicates.get(arr)+1);
			} else {
				mapDuplicates.put(arr, 1);
			}
		}
		mapDuplicates.forEach((key, value)-> {
			if (value > 1) {
				System.out.println(key + "-" + value);
			}
		});
	}

}
