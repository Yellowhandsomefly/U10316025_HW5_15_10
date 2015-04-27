/**
* Name: 黃俊翔
* ID: U10316025 
* Ex: 15.10
* Information: 
*		This is a class which shows the result of the deep copy.
*/
public class TestCloneable{
	
	/**Main method*/
	public static void main(String[] args){
	
		/**Create stack1 object*/
		MyStack stack1 = new MyStack();
		
		/**Push four elements to the ArrrayList of stack1*/
		stack1.push("1");
		stack1.push("2");
		stack1.push("3");
		stack1.push("4");

		/**Print size of stack1*/
		System.out.println("size of stack1 is " + stack1.getSize());		
	
		/**Clone the MyStack object*/
		MyStack stack2 = (MyStack)stack1.clone();

		/**Test if stack1 and stack2 refer to the same object*/
		System.out.println("stack1 == stack2 is " + (stack1 == stack2));
		System.out.println("stack1.equals(stack2) is " + stack1.equals(stack2));

		/**Push four elements to the ArrrayList of stack2*/
		stack2.push("5");
		stack2.push("6");
		stack2.push("7");
		stack2.push("8");

		/**Print size of stack2*/
		System.out.println("size of stack2 is " + stack2.getSize());

		/**Print the elements of stack2 in reverse order*/
		while(!(stack2.isEmpty())){

			System.out.print(stack2.pop() + " ");
		}

	}
}
