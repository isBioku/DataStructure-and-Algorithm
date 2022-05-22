public class LinkedList {
	Node head;
	
	public void InsertIntoMyLinkedList(int data ) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		 
		if (head == null) {
			head = node;
		}
		
		else {
			Node newHead = head;
			while(newHead.next != null) {
				newHead = newHead.next;
			}
			newHead.next = node;
		}
	}
	
	
	public void ShowMyLinkedListData() {
		Node node = head;
		while(node.next != null) {
			System.out.println(node.data);
			node = node.next;
			
		}
		System.out.println(node.data);
	}
	
	public void InsertAtSpecificIndex(int index, int data) {
		int counter = 0;
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if (index == 1) {
			node.next = head;
			head = node;
		}
		else {
			
			
			Node newHead = head;
			
			while (newHead.next != null) {
				counter ++;					
				if (counter == index-1) {
					node.next = newHead.next;
					newHead.next = node;   
			      }
				newHead = newHead.next;
				
			}
		}
	}
	
	
//	public void InsertAtTheEnd(int myLastData) {
//		Node node = new Node();
//		node.data = myLastData;
//		node.next = null;
//		
//		if (head == null) {
//			head = node;
//		}
//		
//		else {
//			Node newHead = head;
//			while (newHead != null) {
//				newHead = newHead.next;
//				
//			}
//			newHead.next = node;
//		}
//	
//	}
	
	public void TotalNumberOfNodes () {
		int nodeCounter = 0;
		Node node = new Node();
		
		if (head == null) {
			System.out.println("OOOOOPS, there is no Node in this linked list");
		}
		else if (head.next == null) {
			System.out.println("OOOkay!!!!, there is just 1 single node in this linked list");
		}
		else {
			Node newHead = head;
			while (newHead.next != null) {
				nodeCounter ++;
				newHead = newHead.next;
			}nodeCounter++;
			System.out.println("Yeaaaa, there are no " + nodeCounter + " Node in this linked list");
		}
	}
	
	public void InsertAtTheBeginning (int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if (head == null) {
			head = node;
		}
		else {
			//head.next = node.next;
			node.next = head;
			head = node;
		}
	}
}
