public class StackFunctions {
	
	int Stack[] = new int[10];
	int index = 0;
	
	public void push(int data) {
		Stack[index] = data;
		System.out.println(Stack[index]);
		index ++;
		
	}
	
	public void Pop () {
		index --;
		Stack[index] = 0;
	
	}
	
	public void Show () {
		for (int p:Stack) {
		
		}
	}
	
	public void Peek () {
		System.out.println(Stack[index]);
	}
	
	public void CountTotalElelmentInMyStack () {
		for (int i = 0; i<Stack.length; i++) {
			index++;
		}
		
		System.out.println(Stack[index]);
	}
}
