// Searching through a single Dimentional Array using a Binary Search Algorithm 

//Binary search splits array into 2 halves 
package everythingArray.searchingArray;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {
						{17, 18, 19, 21}, 
						{1, 2, 3, 5}, 
						{4, 33, 34, 38, 40, 44, 55, 67}
					  };	
		
		int [] array = {3, 9, 10, 15, 17, 18, 19, 21};
		int searchingFor = 4;
		
		int binarySearch = binarySearch1DArray(array, searchingFor);
		System.out.println(binarySearch);
		
		int binarySearchFor2DArray[] = binarySearch2DArray(arr, searchingFor);
		System.out.println(Arrays.toString(binarySearchFor2DArray));
		
		
	}
	// Binary Search on single Dimentional Array
	public static int binarySearch1DArray(int[] array, int searchingFor) {
		int start = 0;
		int end = array.length-1;
		
		while ( start <= end ) {
			int mid = start + (end - start)/2;
			if ( array[mid] == searchingFor) {
				return mid;
			}
			if (array[mid] < searchingFor ) {
				start = mid + 1;
				
			}else {
				end = mid - 1;
			}
		}
		return -1;
	}
	
	//binary search for 2Dimentional Array
	
	public static int[] binarySearch2DArray(int[][]arr, int searchingFor) {
		
		
		for (int i = 0; i < arr.length; i++ ) {
			int start = 0;
			int end = arr[i].length-1;
			
			while (start <= end ) {
				//int mid = start + (end - start)/2;
				
				
				int mid = start + (end - start)/2;
				
				if (arr[i][mid] == searchingFor) {
					return new int[] {i, mid};
				}
				if (arr[i][mid] < searchingFor) {
					start = mid +1 ;
				}else {
					end = mid -1;
				}
			}
		}
		return new int[] {-1, -1};
	}

}
