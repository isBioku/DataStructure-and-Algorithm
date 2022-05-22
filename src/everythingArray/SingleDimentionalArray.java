package everythingArray;

public class SingleDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// implementation of a single dimentional Array
		
		int array[] = new int [5];
		
		for (int i = 0; i<array.length; i++) {
			array[i] = i+1;
			System.out.print(array[i] + ", ");
		}
	}
}
