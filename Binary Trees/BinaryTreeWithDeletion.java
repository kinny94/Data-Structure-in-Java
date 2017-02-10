import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
  
  Node root;
  
  public void addNode(int key, String name){
    Node newNode = new Node(key, name);
    if(root == null){
      root = newNode;
    }else{
      Node focusNode = root;
      Node parent;
      while(true){
        parent = focusNode;
        if(key < focusNode.key){
          focusNode = focusNode.leftChild;
          if(focusNode == null){
            parent.leftChild = newNode;
            return;
          }
        }else{
          focusNode = focusNode.rightChild;
          if(focusNode == null){
            parent.rightChild = newNode;
            return; 
          }
        }
      }
    }
  }
  
  public void inOrderTraverse(Node focusNode){
    if(focusNode != null){
      inOrderTraverse(focusNode.leftChild);
      System.out.println(focusNode);
      inOrderTraverse(focusNode.rightChild);  
    }
  }
  
  public void preOrder(Node focusNode){
    if(focusNode != null){
      System.out.println(focusNode);
      preOrder(focusNode.leftChild);
      preOrder(focusNode.rightChild);
    }
  }
  
  
  public void postOrder(Node focusNode){
    if(focusNode != null){
      postOrder(focusNode.leftChild);
      postOrder(focusNode.rightChild);
      System.out.println(focusNode);
    }
  }
  
  public Node find(int key){
    Node focusNode = root;
    while(focusNode.key != key){
      if(key < focusNode.key){
        focusNode = focusNode.leftChild;
      }else{
        focusNode = focusNode.rightChild;
      }
      
      if(focusNode == null){
        return null;
      }
    }
    return focusNode;
  }
  
  public boolean remove(int key){
    Node focusNode = root;
    Node parent = root;
    
    boolean isItALeftChild = true;
    
    while(focusNode.key != key){
      parent = focusNode;
      
      if(key < focusNode.key){
        isItALeftChild = true;
        focusNode = focusNode.leftChild;
      }else{
        isItALeftChild = false;
        focusNode = focusNode.rightChild;
      }
      
      if(focusNode == null){
        return false;
      }
    }
    if((focusNode.leftChild == null) && (focusNode.rightChild == null)){
      if(focusNode == root){
         root = null;
      }else if(isItALeftChild){
        parent.leftChild = null;
      }else{
        parent.rightChild = null;
      }
    }
    else if(focusNode.rightChild == null){
      if(focusNode == root){
        root = focusNode.leftChild;
      }else if(isItALeftChild){
        parent.leftChild = focusNode.leftChild;
      }else{
        parent.rightChild = focusNode.leftChild;
      }
    }
    
    else if(focusNode.leftChild == null){
      if(focusNode == root){
        root = focusNode.rightChild;
      }else if(isItALeftChild){
        parent.leftChild = focusNode.rightChild;
      }else{
      
        parent.rightChild = focusNode.leftChild;
      }
    }else{
      Node replacement = getReplace(focusNode);
      if(focusNode == root){
        root = replacement;
      }else if(isItALeftChild){
        parent.leftChild = replacement;
      }else{
        parent.rightChild = replacement;
      }
      replacement.leftChild = focusNode.leftChild;
    }
    
    return true;
  }
  
  public Node getReplace(Node replacedNode){
    Node replacementParent = replacedNode;
    Node replacement = replacedNode;
    Node focusNode = replacedNode.rightChild;
    
    while(focusNode != null){
      replacementParent = replacement;
      replacement = focusNode;
      focusNode = focusNode.leftChild;
    }
    if(replacement != replacedNode.rightChild){
      replacementParent.leftChild = replacement.rightChild;
      replacement.rightChild = replacedNode.rightChild;
    }
    return replacement;
  }
  
  public static void main(String[] args) {
    
    Solution binaryTree = new Solution();
    
    binaryTree.addNode(50, "Boss");
    binaryTree.addNode(23, "Loss");
    binaryTree.addNode(13, "Toss");
    binaryTree.addNode(20, "Noss");
    binaryTree.addNode(60, "Ross");
    
    System.out.println("\n ********IN ORDER********* \n");
    binaryTree.inOrderTraverse(binaryTree.root);
    System.out.println("\n ********PRE ORDER*********** \n");
    binaryTree.preOrder(binaryTree.root);
    System.out.println("\n ********POST ORDER********* \n");
    binaryTree.postOrder(binaryTree.root);
    System.out.println("Search for 30");             
    System.out.println(binaryTree.find(23));
    System.out.println("\n ********Deletion********* \n");
    System.out.println("Remove key  25");
    binaryTree.remove(23);
    System.out.println("\n ********PRE ORDER*********** \n");
    binaryTree.preOrder(binaryTree.root);
  }
}

class Node{
  int key;
  String name;
  
  Node leftChild;
  Node rightChild;
  
  Node(int key, String name){
    this.key = key;
    this.name = name;
  }
  
  public String toString(){
    return name + " has a key " + key;
  }
}
