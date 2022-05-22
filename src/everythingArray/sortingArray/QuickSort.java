package everythingArray.sortingArray;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int array []= {2, 9, 10, 33, 44, 1 , 12, 61, 22, 76};	
		int start = 0;
		int end = array.length-1;
		
		int sortedQuickly [] = quickSort(array,start, end);
		System.out.print(Arrays.toString(sortedQuickly));
	}
	
	public static int [] quickSort(int array[], int start, int end) {
		if (end <= start ) {
			return array;
		}
		
		int pivot= partition( array, start, end);
		quickSort(array, start, pivot-1);
		quickSort (array, pivot + 1, end);
		
		return array;
	}
	
	public static int partition (int array[], int start, int end) {
		int pivot = array[end];
		int i = start - 1;
		
		for (int j = start; j <= end -1; j++) {
			if (array[j] < pivot) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
			
		}
		i++;
		int temp = array[i];
		array[i] = array[end];
		array[end] = temp;
		
		return i;
	}

}
