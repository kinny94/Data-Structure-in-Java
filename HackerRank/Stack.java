import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

public class Stack {

	private String[] stackArray;
	private int maxLength;
	private int top;
	
	Stack(){
		top = -1;
		maxLength = 1000;
		stackArray = new String[maxLength];
	}
	
	boolean isFull(){
		if(top >= maxLength){
			return true;
		}else{
			return false;
		}
	}
	
	boolean isEmpty(){
		if(top == -1){
			return true;
		}else{
			return false;
		}
	}

	int size(){
		return top + 1;
	}
	
	public void push(String input){
		if(!isFull()){
			stackArray[++top] = input;
		}
	}

	public String pop(){
		if(!isEmpty()){
			return stackArray[top--];
		}else{
			return null;
		}
	}

	public String peek(){
		if(!isEmpty()){
			return stackArray[top];
		}else{
			return null;
		}
	}

	public static boolean isBalanced(String expression){
		String[] x = expression.split("");
		Stack stack = new Stack();
		
		boolean f = true;
		for(int i=0; i<x.length; i++){
			switch (x[i]) {
			case "}":
				if(stack.peek()!= null && stack.peek().equals("{")){
					stack.pop();
				}else{
					f = false;
				}
				break;
			case ")":
				if(stack.peek()!= null && stack.peek().equals("(")){
					stack.pop();
				}else{
					f = false;
				}
				break;
			case "]":
					if(stack.peek()!= null && stack.peek().equals("[")){
						stack.pop();
					}else{
						f = false;
					}
					break;
			default:
				stack.push(x[i]);
				break;
			}
			if( f == false){
				break;
			}
		}
		if(stack.isEmpty()){
			return f;
		}else{
			f = false;
			return f;
		}
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			String expression = in.next();
			System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
		}
	}
}
