package everythingArray.sortingArray;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int array[]= {10, 4, 2, 3, 5, 78, 0, 22, 56};
		int sortedArray[] = selectionSort(array);
		System.out.print(Arrays.toString(sortedArray));

	}
	
	public static int [] selectionSort (int[] array) {
		for (int i = 0; i < array.length-1; i++ ) {
			int min = i;
			for (int j = i+1; j < array.length; j++) {
				if (array[min] > array[j]) {
					min = j;
				}
			}
			
			int temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
		
		return array;
		
	}

}
