//Bubble sort compares 2 elements in an array and swaps them if the next element is bigger than the previous element 
package everythingArray.sortingArray;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int array[] = {20, 10, 11, 1, 14, 33, 12 };
		int sort1D[] = sort1DimentionalArray(array);
		System.out.println(Arrays.toString(sort1D));
		//System.out.println();
		
		
		int array2D[][] = {
							{20, 22, 13, 11, 23}, 
							{22, 13, 11, 89,77},
							{90, 11, 45, 2, 13, 1, 55}
						   };
		
		int [][] sorted2DArray = sort2DimentionalArray(array2D);
		System.out.print(Arrays.deepToString(sorted2DArray));
	}
	

//Bubble sort on a single/linear dimentional Array
	public static int[] sort1DimentionalArray (int[] array) {
		for (int i =0; i < array.length; i++) {
			for (int j = 0; j <array.length-1-i; j++) {
				if (array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}
	
	//Bubble sort on a 2Dimentional Array dimentional Array
	
	public static int[][]sort2DimentionalArray (int [][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j= 0; j < array[i].length; j++) {
				for (int k = 0; k < array[i].length-1-j; k++) {
					if (array[i][k] > array[i][k+1]) {
						int temp = array[i][k];
						array[i][k] = array[i][k+1];
						array[i][k+1] = temp;
					}
				}
			}
		}
		return array;
	}

	
}
