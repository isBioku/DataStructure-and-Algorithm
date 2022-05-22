

import java.util.Arrays;


public final class LinearSearch {

	public static void main(String[] args) {
		// searching through a single dimentional Array
		Array arra = new Array();
		int array1[] = new int[20];
		
		int array[] = {1, 4, 59, 50, 44, 67};
		int target = 0;
		
		int answer[] = searchSingleDimentionalArrayFunction(array, target);
		System.out.println(Arrays.toString(answer));
		
		
		int arr[][] = {
				{1, 20, 33, 44, 67},
				{0, 59, 50, 7, 47}, 
				{330, 66, 667, 77, 9, 88, 456, 789, 79}
				};
		
		int lookingFor = 770;
		
		int ans[] = searching2DimentionalArray(arr, lookingFor);
		System.out.println(Arrays.toString(ans));
		
		
		// replacement in single dimentional Array
		int replace1D[] = replacement(array, 10, 2 );
		System.out.println(Arrays.toString(replace1D));
		
		// replacement in replacementIn2D dimentional Array
		int replace2D[][] = replacementIn2D(arr, 3000, 2 );
		System.out.println(Arrays.deepToString(replace2D));
		
		int insert1D [] = insertionin1D(array, 11000, 3 );
		System.out.println(Arrays.toString(insert1D));
		
//		for (int i = 0; i<array.length; i++) {
//			if (array[i] == 4) {
//				System.out.print(" Yea, the number you are looking for is at index: " + i);
//			}
//		}
		
	}
	
	// A more comprehensive linear search of single dimentional array
	public static int[] searchSingleDimentionalArrayFunction (int array[], int target) {
		for (int i = 0; i<array.length; i++) {
			if (array[i] == target ) {
				return new int[] {i};
			}
		}
		return new int[] {-1};
		
	}
	
	// A more comprehensive linear search on 2Dimentional array	
	public static int[] searching2DimentionalArray (int array2D[][], int lookingFor) {
		for (int i = 0; i <array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {
				if (array2D[i][j] == lookingFor) {
					return new int[] {i, j};
				}
			}
		}return new int[] {-1, -1};
	}
	
	//replacement of value in a single dimentional Array at a particular index	
	public static int[] replacement (int array[], int value, int index) {
		int valueAtIndex = array[index];
		for (int i = index; i < array.length; i++) {
			if (array.length == 0) {
				index = 0;
				array[index] = value;
			}else {
				array[index] = value;
			}			
		}
		return array;
	}
	
	//replacement of value in a 2Dimentional array
	
	public static int[][] replacementIn2D (int array[][], int value, int index) {
		for (int i = 0; i<array.length; i++) {
			for (int j =0; j <array[i].length; j++) {
				if (i< array.length) {
					array[i][index] = value;
				}
			}
		}
		
			return array;
	}
	
	//insertion into a single dimentional array
	public static int[] insertionin1D (int array[], int value, int index) {
		for (int i = index; i < array.length+1; i++ ) {
			array[i+1] = array[i];
		}array[index] = value;
		return array;
	}

}
