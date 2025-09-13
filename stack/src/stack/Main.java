package stack;

public class Main {

	public static void main(String[] args) throws Exception {
		CustomStack stack = new CustomStack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		System.out.println(stack.size);
		
		stack.pop();
		System.out.println(stack.size);
		
		System.out.println(stack.peek());
		System.out.println(stack.size);
		
	}

}
