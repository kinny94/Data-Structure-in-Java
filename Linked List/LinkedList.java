import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
 
  public String book;
  public int sold;
  public Solution next;
  
  public Solution(String book, int sold){
    this.book = book;
    this.sold = sold;  
  }
  
  public void display(){
    System.out.println(book + " : " + sold + ",000,000");
  }
  
  public String toString(){
    return book;
  }
  
  public static void main(String[] args) {
    LinkList newLinkedList = new LinkList();
    newLinkedList.insert("Harry Potter", 500);
    newLinkedList.insert("Lord of the Rings", 700);
    newLinkedList.insert("Alchemist", 1060);
    newLinkedList.insert("Harry Potter", 500);
    newLinkedList.insert("Da Vinci Code", 1100);
    newLinkedList.insert("50 Shades of Grey", 200);
    
    newLinkedList.display();
    System.out.println("*****************************\n");
    newLinkedList.removeFirst();
    newLinkedList.display();
    System.out.println("*****************************\n");
    
    System.out.println(newLinkedList.find("Harry Potter").book + " was found!! It sold " + newLinkedList.find("Harry Potter").sold + ",000,000 copies.\n");
    
    System.out.println("*****************************\n");
    
    newLinkedList.remove("Alchemist");
    newLinkedList.display();
  }
}

class LinkList{
   
  public Solution firstLink;
  
  LinkList(){
    firstLink = null;
  }
  
  public boolean isEmpty(){
    return(firstLink == null);
  }
  
  public void insert(String book, int sold){
    Solution newLink = new Solution(book, sold);
    newLink.next = firstLink;
    firstLink = newLink;
  }
  
  public Solution removeFirst(){
    Solution linkReference = firstLink;
    if(!isEmpty()){
      firstLink = firstLink.next;
    }else{
      System.out.println("Empty Linked List");
    }
    
    return linkReference;
  }
  
  public void display(){
    Solution theLink = firstLink;
    while(theLink != null){
      theLink.display();
      System.out.println("Next Link: " + theLink.next);
      theLink = theLink.next;
      System.out.println();
    }
  }
  
  public Solution find(String book){
    Solution theLink = firstLink;
    
    if(!isEmpty()){
      while(theLink.book != book){
        if(theLink.next == null){
          return null;
        }else{
          theLink = theLink.next;
        }
      }
    }else{
      System.out.println("Empty Link List");
    }
    return theLink;
  }
  
  public Solution remove(String book){
    Solution currentLink = firstLink;
    Solution previousLink = firstLink;
  
    while(currentLink.book != book){
      if(currentLink.next == null){
        return null;
      }else{
        previousLink = currentLink;
        currentLink = currentLink.next;
      }
    }
    
    if(currentLink == firstLink){
      firstLink = firstLink.next;
    }else{
      previousLink.next = currentLink.next;
    }
    
    return currentLink;
  
  }
  
}
