package DAY5;

public class stack {
	int[] stack1=new int[10];
	int top=-1;
	public void push(int val) {
		if(top<9)
		{
			 stack1[++top]=val;
		}
		else
		{
			System.out.println("stack overflow");		
	}
	}
	void display() {
		for(int i=0;i<=top;i++)
		System.out.println(stack1[i]+" ");
	}
	// public int pop() {
		// public in pop() {
		  //      if (top == -1) {
		       //     System.out.println("Stack underflow");
		   //         return -1;
		       // }

		      //  int[] stackArray;
			//	int poppedElement = stackArray[top--];
		     //   System.out.println(poppedElement + " popped from the stack");
		      //  return poppedElement();
		 

			
	

}

