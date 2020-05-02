package rearrangingarrays;

public class PrintRearrangedArray {

	public static void main(String[] args) {
		RearrangingArrays lists = new RearrangingArrays();
		int[] arrs = {5, 2, 9, 4, 1, 3, 10}; // 3 2 1
//		int[] arrs = {10, 5, 2, 7, 6, 4, 3};
		if (arrs.length > 0) {
//			lists.partitionArray(arrs, 0, arrs.length-1);
			lists.rearragingAccordingToInterview(arrs);
			System.out.println("Rearranged array:");
			for(int integer: arrs) {
				System.out.print(integer + " ");
			}
		} else {
			System.out.print("Array is empty");
		}
	}

}
