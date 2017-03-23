package StackArray;

public class Stack<T extends Comparable<T>> {
	
	private T[] stack;
	private int numOfItems;
	
	public Stack(){
		this.stack = (T[]) new Object[1];	//Java doesn't support generic array, that y we have to use Object Array
	}
	
	public void push(T newData){
		if(numOfItems == this.stack.length){
			resize(2*this.stack.length); 
		}
		this.stack[numOfItems++] = newData;
	}
	
	public void resize(int capacity){
		T[] stackCopy = (T[]) new Object[capacity];
		for(int i=0; i<numOfItems; i++){
			stackCopy[i] = this.stack[i];
		}
		
		this.stack = stackCopy;
	}
	
	public T peek(){
		return this.stack[numOfItems];
	}
	
	public T pop(){
		T itemToPop = this.stack[--numOfItems];
		if((numOfItems > 0) && (numOfItems == this.stack.length / 4)){	//Size is 25%, standard type suggested by Mathematicians
			resize(this.stack.length/2);
		}
		return itemToPop;
	}
	
	public boolean isEmpty(){
		return this.numOfItems == 0;
	}
	
	public int size(){
		return this.numOfItems;
	}
}
