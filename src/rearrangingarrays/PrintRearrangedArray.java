package rearrangingarrays;

public class PrintRearrangedArray {

	public static void main(String[] args) {
		RearrangingArrays lists = new RearrangingArrays();
		int[] arrs = {5, 2, 9, 4, 1, 3, 10};
		lists.rearrangeList(arrs);
		System.out.println("Rearranged array:");
		for(int integer: arrs) {
			System.out.print(integer + " ");
		}

	}

}
