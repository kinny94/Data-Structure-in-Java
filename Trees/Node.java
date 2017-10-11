public class Node<T>{
    public T data; 
    private Node<T> leftChild;
    private Node<T> rightChild;

    public Node(T data){
        this.data = data;
    }

    public T getData(){
        return data;
    }

    public void setData(T data){
        this.data = data;
    }

    public Node<T> getLeftChild(){
        return leftChild;
    }

    public Node<T> getRightChild(){
        return rightChild;
    }

    public void setLeftChild(Node<T> leftChild){
        this.leftChild = leftChild;
    }

    public void setRightChild(Node<T> rightChild){
        this.rightChild = rightChild;
    }

    public String toString(){
        return this.data.toString();
    }
}
