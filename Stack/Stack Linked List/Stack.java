package StackLisnkedList;

public class Stack<T extends Comparable<T>> {

	private Node<T> root;
	private int count;
	
	public void push(T newData){
		this.count++;
		
		if(this.root == null){
			this.root = new Node<T>(newData);
		}else{
			Node<T> oldroot = this.root;
			this.root = new Node<T> (newData);
			this.root.setNextNode(oldroot);
		}
	}
	
	public T pop(){
		T itemToPop = this.root.getData();
		this.root = this.root.getNextNode();
		this.count--;
		return itemToPop;
	}
	
	public T peek(){
		T item = this.root.getData();
		return item;
	}
	
	public int size(){
		return this.count;
	}
	
	public boolean isEmpty(){
		return this.root == null;
	}

}
