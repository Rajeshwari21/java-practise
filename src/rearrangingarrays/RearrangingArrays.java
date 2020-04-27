package rearrangingarrays;

public class RearrangingArrays {
	// 5, 2, 9, 4, 1, 3, 10 - array
	// 0  1  2  3  4  5  6  - index
	public void rearrangeList(int[] array) {
		int n = array.length;
		int centerElement = n/2;
		int temp = array[centerElement];
		array[centerElement] = array[0];
		array[0] = temp;
		int pivot = 0, i = 1;
		while(i < array.length) {  // 4 2 9 5 1 3 10 - new array after swap.
			if (array[pivot] > array[i]) {
				shiftElementToLeft(array, i); // 2 4 9 5 1 3 10  on next less than: array = 1 2 4 9 5 3 10 on next less than: array = 3 1 2 4 9 5 10
				pivot++;
				i++;
			}
			else {
				i++;
			}
		}
	}

	// Helper function to shift smaller elements to left.
	public void shiftElementToLeft(int[] array, int i) {
		int temp = array[i]; // 2 1 3
		for (int j=i; j>0; j--) {
			array[j] = array[j-1];
		}
		array[0] = temp;
	}	
}
