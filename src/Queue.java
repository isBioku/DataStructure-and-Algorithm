
public class Queue {
	int frontDoor;
	int rearDoor ;
	int size ;
	
	int myArrayQueue[] = new int[5];
	
	public void enQueue(int data) {
		myArrayQueue[rearDoor] = data;
		rearDoor = (rearDoor +1)%5;
		size ++;
	}
	
	public void show () {
		for( int n = 0; n < size; n++ ) {
			System.out.println(myArrayQueue[(frontDoor+ n) %5]);
		}
	}
	
	public void deQueue () {
		frontDoor = (frontDoor + 1)%5;
		size --;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	
	public boolean isFull() {
		return size ==5;
	}
	
}
