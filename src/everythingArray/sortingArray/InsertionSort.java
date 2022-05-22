package everythingArray.sortingArray;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][] = {{1, 45, 20, 33, 50, 0 }, {2, 22, 21, 14, 10}, {3,33, 1, 0, 13, 11 }};
		int response[][] = insertionSort2D(array);
		
		for (int [] i : array) {
			System.out.println(Arrays.toString(i));
		}
		
		System.out.print("The sorted array is : ");
		System.out.println(Arrays.deepToString(response));
		
		int array1D[] = {2, 22, 21, 14, 10};
		int response1D[] = insertionSort(array1D);
		
		System.out.print(Arrays.toString(response1D));
	}
	

	
	
	
	 //Implementation of insertion sort or linear array
	
	public static int[] insertionSort(int array[]) {
		for (int i = 1; i<array.length; i++) {
			int j = i - 1;
			int current = array[i];
			while (j >=0 && array[j] > current) {
  				array[j+1] = array[j];
				j--;
			}array[j+1] = current;
		}
		return array;
	}
	
	//Implementation of insertion sort on 2D array
	
	public static int[][] insertionSort2D (int array[][])  {
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array[i].length; j++) {
				int k = j-1;
				int current = array[i][j];
				while (k >= 0 && array[i][k] > current) {
					array[i][k+1] = array[i][k];
					k--;
				}
				array[i][k+1] = current;
			}
		}
		
		return array;
	}
	

}
