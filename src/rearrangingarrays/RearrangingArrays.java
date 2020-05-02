package rearrangingarrays;

public class RearrangingArrays {
	// 5, 2, 9, 4, 1, 3, 10 - array
	// 0  1  2  3  4  5  6  - index
	public void rearrangeListLeft(int[] array) {
		int n = array.length;
		int lastElement = n-1;
		int centerElement = n/2;
		int temp = array[centerElement];
		array[centerElement] = array[0];
		array[0] = temp;
		int pivot = 0, i = 1;
		
		while(i < array.length) {
			if (array[pivot] > array[i]) {
				shiftSmallElementToLeft(array, i); // 2 4 9 5 1 3 10  on next less than: array = 1 2 4 9 5 3 10 on next less than: array = 3 1 2 4 9 5 10
				pivot++;
				i++;
			}
			else {
				i++;
			}
		}
	}

	// Helper function to shift smaller elements to left.
	public void shiftSmallElementToLeft(int[] array, int i) {
		int temp = array[i]; // 2 1 3
		for (int j=i; j>0; j--) {
			array[j] = array[j-1];
		}
		array[0] = temp;
	}	
	
	public void rearrangeListRight(int[] array) {
		int n = array.length;
		int lastElement = n-1;
		int centerElement = n/2;
		int temp = array[centerElement];
		array[centerElement] = array[lastElement];
		array[lastElement] = temp; // 5, 2, 9, 10, 1, 3, 4 = new array
		int newPivot = array.length-1;
		int newi = array.length-2;
		while(newi >= 0) {
			if (array[newPivot] < array[newi]) {
				shiftLargeElementToRight(array, newi); 
				newPivot--;
				newi--;
			}
			else {
				newi--;
			}
		}
	}
	public void shiftLargeElementToRight(int[] array, int i) {
		int temp = array[i];
		for (int j=i; j<array.length-1; j++) {
			array[j] = array[j+1];
		}
		array[array.length-1] = temp;
	}
	
	public void swapList(int[] array) {
		int n = array.length;
		int lastElement = n-1;
		int centerElement = n/2;
		int temp = array[centerElement];
		array[centerElement] = array[lastElement];
		array[lastElement] = temp; // 5, 2, 9, 10, 1, 3, 4 = new array 3 2 9 10 1 4 5 / 3 2 4 10 1 9 5 / 3 2 1 10 4 9 5 / 3 2 1 4 10 9 5 
		int i = 0;
		int j = lastElement;
		boolean flag = false;
		while (i != j) {
			if (array[i] > array[j]) {
				swap(i, j, array);
				if (flag != true) {
					j--;
					flag = true;
				} else {
					i++;
					flag = false;
				}
			} else {
				i++;
			}
		}
		
	}
	
	public void swap(int i, int j, int[] array) {
		int temp = array[j];
		array[j] = array[i];
		array[i] = temp;
	}
	
	
	public void rightPivot(int[] array) {
		int n = array.length;
		int mid = n/2;
		int temp = array[mid];
		array[mid] = array[array.length-1];
		array[array.length-1] = temp;
		int j = array.length-1;
		int i=0;
		while(i!=j) {
			if (array[i] > array[j])  {
				shiftElementToRight(i, array);
				j--;
			} else {
				 i++;
			}
		}
	}
	
	public void shiftElementToRight(int i, int[] array) {
		int temp = array[i];
		for(int j=i; j<array.length-1; j++) {
			array[j] = array[j+1];
		}
		array[array.length-1] = temp;
	}
	
	
	// rearranging arrays as a part of quicksort.
	// 5, 2, 9, 4, 1, 3, 10
	public void partitionArray(int[] arrays, int start, int end) {
		int mid = arrays.length/2;
		int temp = arrays[mid];
		arrays[mid] = arrays[arrays.length-1];
		arrays[end] = temp;    // 5, 2, 9, 10, 1, 3, 4 new array = 2 5 9 10 1 3 4 new array = 2 1 9 10 5 3 4 new array = 2 1 3 10 5 9 4
		
		int i = start;
		int pivot = arrays[end];

		for (int j=0; j<end; j++) {
			if (arrays[j] < pivot) {  
				swapElements(i, j, arrays);
				i++;
			}
		}
		swapElements(i, end, arrays);
	}
	
	public void swapElements(int i, int j, int[] arrays) {
		int temp = arrays[i];
		arrays[i] = arrays[j];
		arrays[j] = temp;
	}
	
	// interview question solved.
	public void rearragingAccordingToInterview(int[] arrays) {
		int mid = arrays.length/2;
		int temp = arrays[mid];
		arrays[mid] = arrays[arrays.length-1];
		arrays[arrays.length-1] = temp; // 5, 2, 9, 10, 1, 3, 4
		int i = 0;
		int j = arrays.length-2;
		int pivot = arrays.length-1;
		while(i != j) {
			if (arrays[i] < arrays[pivot] && arrays[j] > arrays[pivot]) {
				i++;
			}
			else if (arrays[i] > arrays[pivot] && arrays[j] < arrays[pivot]) { // 3 2 9 10 1 5 4 new array 3 2 1 10 9 5 4
				swapElementInArray(i, j, arrays);
				i++;
			}
			else if (arrays[i] < arrays[pivot] && arrays[j] < arrays[pivot]) {
				i++;
			}
			else if (arrays[i] > arrays[pivot] && arrays[j] > arrays[pivot]) {
				j--;
			}
		}
		swapElementInArray(i, pivot, arrays); // 3 2 1 4 9 5 10
	}
	
	public void swapElementInArray(int i, int j, int[] arrays) {
		int temp = arrays[i];
		arrays[i] = arrays[j];
		arrays[j] = temp;
	}
}
