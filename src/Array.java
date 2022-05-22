public class Array {
	int Array[]= new int[7];
	int counter = 0;
	int nextValue = 0;
	int keepIndex = 0;
	
	
	public void ArrayAddition(int data ) {
		 if (counter == 0) {
             Array[counter] = data;
             counter++;
        
		 }else {
			 Array[counter] = data;
             counter++;
		 }
	    	  
		
		
	}
	// function to add data to the front of the array. [8, 2]

	   public void AddToTheBeginningOfArray (int data) {
		   
	       if (counter == 0) {
	               Array[counter] = data;
	               counter++;
	          
	       }else {
	    	   for (int i = 0; i<counter; i++) {
	    		   
	    		   if (Array[i+1] != 0) {
	    			   nextValue = Array[i+1];
	    			   Array[i +1] = Array[i];
	    		   }else {
	    			   Array[i+1] = nextValue;
	    			   Array [0] = data;
	    		   }
	    		   
	    	   }
	    	   
	    	   counter++;
	    	  
	 
	       }
	   }
	
	public void ArrayInsertionAtAnIndex(int index, int data ) {
		counter ++;
		//System.out.println(Array[index]);		
		if (counter == 0) {
			Array[counter] = data;
		}else {
			for (int i = index; i < counter; i++) {
				
				if (Array[i+1] !=0) {	
					nextValue = Array[index+1];
					Array[index+1] = Array[index];
					
				}else {
					
					Array[index+1] = nextValue;
					Array[index] = data;
					
					
					
				}
				
			}
			//counter--;
		}
	}
	
	public void PrintAllTheElementInMyArray() {
		for (int p:Array) {
			System.out.println(p);
		}
	}
	
	public void InsertAtTheStartOfMyArray(int data) {
		Array[0] = data;
		Array[counter] = data;
	}
	
	public void FirstElement() {
		System.out.print(Array[0]);
	}

}
