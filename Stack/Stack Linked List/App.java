package StackLisnkedList;

public class App {
	public static void main(String args[]){
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		
		System.out.println(stack.peek());
		System.out.println(stack.size());
		
		System.out.println(stack.pop());
		
		System.out.println(stack.peek());
		System.out.println(stack.size());
		
	}
}
