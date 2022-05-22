package everythingArray;

import java.util.Arrays;

public class DoubleDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int Array [][] = new int [5][5];
		
		
		int Array[][] = {{1, 5, 5}, {10, 30, 22, 23, 5, 76}, {5, 32, 55, 76} };
		int target = 5;
		int counter = 0;
		
//		int[] answer = fitc (Array, target);
//		
//		System.out.print(Arrays.toString(answer));
//		
		
		for (int i = 0; i < Array.length; i++) {
			for (int j = 0; j <Array[i].length; j++) {
				//Array[i][j] = i + j;
				//System.out.print(Array[i][j] + " ");
				
				if (Array[i][j] == target) {
					counter ++;
					System.out.print("There is  " + target + " at row " + i + " Column " + j);
					System.out.println();
				}
//				
			}//System.out.println();
		}
		
		System.out.print("There are " + counter + " " + target + "'s in this array");
	}
		
	
//	static int[]  fitc (int[][] Array, int target) {
//		for (int i = 0; i < Array.length; i++) {
//			for (int j = 0; j <Array[i].length; j++) {
//				//Array[i][j] = i + j;
//				//System.out.print(Array[i][j] + " ");
//				
//				if (Array[i][j] == target) {
//					return new int[] { i, j };
//				}
//				
//			}
//		}return new int[] { -1, -1 };
//	}

}
