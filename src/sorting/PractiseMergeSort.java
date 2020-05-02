package sorting;

public class PractiseMergeSort {

	// Merge Sort 5, 2, 9, 4, 1, 3, 10 - array
	// 0  1  2  3  4  5  6  - index
	public void mergeSort(int[] array) {
		int n = array.length;
		if (n < 2) {
			return;
		}
		int midOfArray = n/2; // 4 2 1
		int[] leftArray = new int[midOfArray];
		int[] rightArray = new int[n - midOfArray];
		
		for (int i=0; i < midOfArray; i++) {
			leftArray[i] = array[i]; // 5 4 7 1
		}
		for (int i=midOfArray; i < n; i++) {
			rightArray[i-midOfArray] = array[i];  // 8 10 9 2
		}
		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(leftArray, rightArray, array);

	}

	private void merge(int[] leftSortedArray, int[] rightSortedArray, int[] array) {
		int nL = leftSortedArray.length; // 4
		int nR = rightSortedArray.length; // 4
		int i = 0, j = 0, k = 0;
		while (i<nL && j<nR) {
			if (leftSortedArray[i] < rightSortedArray[j]) {
				array[k] = leftSortedArray[i];
				i++;
			} else {
				array[k] = rightSortedArray[j];
				j++;
			}
			k++;
		}
		while (i<nL) {
			array[k] = leftSortedArray[i];
			k++;
			i++;
		}
		while (j<nR) {
			array[k] = rightSortedArray[j];
			k++;
			j++;
		}
	}
	
	// Bubble Sort.  5, 2, 9, 4, 1, 3, 10 - array
	public void bubbleSort(int[] arrays) {
		int n = arrays.length;
		for (int k=1; k<n-1; k++) {
			boolean flag = false;
			for (int i=0; i<n-k-1; i++) {
				if (arrays[i] > arrays[i+1]) {
					swap(i, i+1, arrays);
					flag = true;
				}
			}
			if (flag == false) break;
		}
	}

	private void swap(int i, int j, int[] arrays) {
		int temp = arrays[i];
		arrays[i] = arrays[j];
		arrays[j] = temp;
	}
	
	
	// Selection sort. 5, 2, 9, 4, 1, 3, 10 - array
	public void selectionSort(int[] arrays) {
		int n = arrays.length;
		for (int i=0; i<n-1; i++) {
			int iMin = i;
			for (int j=i+1; j<n; j++) {
				if (arrays[j] < arrays[iMin]) {
					iMin = j; // 3 5 - index
				}
			}
			int temp = arrays[i];  // 1, 2, 9, 4 , 5, 3, 10 -- 1 2 3 4 5 9 10
			arrays[i] = arrays[iMin];
			arrays[iMin] = temp;
		}
	}

}
