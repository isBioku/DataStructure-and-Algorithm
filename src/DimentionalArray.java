// This is a 2 dimentional Array
public class DimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A2DimentionalArray [][] = new int [5][10];
		
		for (int i =0; i<A2DimentionalArray.length; i++) {
			for(int j =0; j<A2DimentionalArray[i].length; j++) {
				A2DimentionalArray[i][j] = i+j;
				System.out.print(A2DimentionalArray[i][j] + " ");
			}System.out.println();
		}

	}

}


