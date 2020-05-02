package sorting;

public class PrintMergeSort {

	public static void main(String[] args) {
		
		PractiseMergeSort sort = new PractiseMergeSort();
		int[] arrs = {5, 2, 9, 4, 1, 3, 10};
		sort.selectionSort(arrs);
		System.out.println("Sorted Array list:");
		for(int integer: arrs) {
			System.out.print(integer + " ");
		}
	}

}
