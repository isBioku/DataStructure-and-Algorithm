package everythingArray.sortingArray;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {20, 12, 11, 90, 18, 54, 78, 9, 0, 33};
		
		int [] rearrange = mergeSort(array);
		
		System.out.print(Arrays.toString(rearrange));
	}
	//Mergesort on Linear array
	
	// method that keeps halfing array and storing each half into different arrays
	public static int[] mergeSort(int[] array) {
		int sizeOfArray = array.length;
		if (sizeOfArray<=1) return array;
		int middleOfArray = sizeOfArray/2;
		int [] leftArray = new int [middleOfArray];
		int [] rightArray = new int [sizeOfArray - middleOfArray];
		
		int j = 0;
		
		for(int i = 0; i < sizeOfArray; i++) {
			if (i < middleOfArray) {
				leftArray[i] = array[i];
			}else {
				
				rightArray[j] = array[i];
				j++;
			}
		}
		mergeSort(leftArray);
		mergeSort(rightArray);
		sortAndMerge(leftArray, rightArray, array );
		return array;
	}
	
	// method that compares, sorts and merges back the array to form a 1 full array
	public static void sortAndMerge (int[] leftArray, int[] rightArray, int[]array) {
		int sizeOfArray = array.length;
		int mid = sizeOfArray/2;
		int sizeOfLeftArray = mid;
		int sizeOfRightArray = sizeOfArray - sizeOfLeftArray;
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while (j < sizeOfLeftArray && k < sizeOfRightArray) {
			if (leftArray[j] < rightArray[k]) {
				array[i] = leftArray[j];
				i++;
				j++;
			}else {
				array[i] = rightArray[k];
				i++;
				k++;
			}
		}
		
		while(j < sizeOfLeftArray) {
			array[i] = leftArray[j];
			i++;
			j++;
		}
		while(k < sizeOfRightArray) {
			array[i] = rightArray[k];
			i++;
			k++;
		}
	}

	
	
	 //mergeSort on 2Dimentional array
//	public static int[][] sort2DArray (int [][] array) {
//		int size = array.length;
//		if (size <=1) {
//			return array;
//		}
//		for (int i = 0; i < array.length; i++) {
//			int lengthOfEachInnerArray = array[i].length;
//			int middle = lengthOfEachInnerArray/2;
//			
//			//creation of each array
//			
//			int [] leftArray = new int[middle];
//			int []rightArray = new int [lengthOfEachInnerArray - middle];
//			
//			if (array[i].length <= 1 ) {
//				//return array[i][];
//			}
//			
//			int leftArrayIndex = 0;
//			int rightArrayIndex = 0;
//			
//			for (leftArrayIndex = 0; leftArrayIndex < lengthOfEachInnerArray; leftArrayIndex++ ) {
//				if (leftArrayIndex < middle) {
//					leftArray[leftArrayIndex] = array[i][leftArrayIndex];
//
//				}else {
//					rightArray[rightArrayIndex] = array[i][leftArrayIndex];
//					rightArrayIndex++;
//				}
//				
//			}
//			
//			
//		}
//		sort2DArray(leftArray);
//		return array;
//	}

}
