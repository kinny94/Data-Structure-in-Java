package LinkedList;

public class LinkedListImplementation<T extends Comparable<T>> implements List<T>{

	private Node<T> root;
	private int sizeOfList;
	 
	@Override
	public void insert(T data) {
		
		++this.sizeOfList;
		 
		if(root == null){
			this.root = new Node<>(data);
		}else{
			insertDataAtTheBegining(data);
		}
		
	}
	
	public void insertDataAtTheBegining(T data){
		Node<T> newNode = new Node<>(data);
		newNode.setNextNode(root);
		this.root = newNode;
	}
	
	public void insertAtTheEnd(T data, Node<T> node){
		if(node.getNextNode() != null){
			insertAtTheEnd(data, node.getNextNode());
		}else{
			Node<T> newNode = new Node<>(data);
			node.setNextNode(newNode);
		}
	}

	@Override
	public void delete(T data) {

		if(this.root == null) return;
		
		--this.sizeOfList;
		
		if(this.root.getData().compareTo(data)==0){
			this.root = this.root.getNextNode();
		}else{
			delete(data, root, root.getNextNode());
		}
		
	}
	
	public void delete(T data, Node<T> previousNode, Node<T> actualNode){
		
		while(actualNode != null){
			if(actualNode.getData().compareTo(data) == 0){
				previousNode.setNextNode(actualNode.getNextNode());
				actualNode = null;
				return;
			}
			
			previousNode = actualNode;
			actualNode = actualNode.getNextNode();
		}
		
	}

	@Override
	public void traveseList() {
		
		if(this.root == null) return;
		
		Node<T> actualNode = this.root;
		
		while(actualNode != null){
			System.out.print(actualNode + " -> ");
			actualNode = actualNode.getNextNode();
		}
	}

	@Override
	public int size() {
		return this.sizeOfList;
	}
	
}