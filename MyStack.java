

import java.util.ArrayList;

public class MyStack implements Cloneable{
	
	/**Declare a ArrayList*/
	private ArrayList<Object> list = new ArrayList<Object>();

	/**Return true if ArrayList is empty*/
	public boolean isEmpty() {
		return list.isEmpty();
	}

	/**Return the size of ArrayList*/
	public int getSize() {
		return list.size();
	}

	/**Return the last element*/
	public Object peek() {
		return list.get(getSize() - 1);
	}

	/**Return the last element and delete the last element*/
	public Object pop() {
		Object o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}

	/**Push the element*/
	public void push(Object o) {
		list.add(o);
	}

	@Override
	public String toString() {
		return "stack: " + list.toString();
	}

	public Object clone(){
		
		try{
			
			/**Perform a shallow copy*/
			MyStack stack = (MyStack)super.clone();
			
			/**Deep copy*/
			stack.list = (ArrayList<Object>)(list.clone());
			return stack;
		}
		catch (CloneNotSupportedException ex){
			return null;
		}
	}

}
