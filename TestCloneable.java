public class TestCloneable{
	public static void main(String[] args){
	
		MyStack stack1 = new MyStack();
		stack1.push("1");
		stack1.push("2");
		stack1.push("3");
		stack1.push("4");

		System.out.println("size of stack1 is " + stack1.getSize());		
	
		MyStack stack2 = (MyStack)stack1.clone();

		System.out.println("stack1 == stack2 is " + (stack1 == stack2));
		System.out.println("stack1.equals(stack2) is " + stack1.equals(stack2));

		stack2.push("5");
		stack2.push("6");
		stack2.push("7");
		stack2.push("8");

		System.out.println("size of stack2 is " + stack2.getSize());

		while(!(stack2.isEmpty())){

			System.out.print(stack2.pop() + " ");
		}

	}
}
