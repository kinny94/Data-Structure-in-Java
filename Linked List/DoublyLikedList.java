import java.io.*;
import java.util.*;

class Solution {
  
  Neighbour firstLink;
  Neighbour lastLink;
  
  public void insertInFirstPosition(String name, int houseNumber){
    Neighbour theNewLink = new Neighbour(name, houseNumber);
    if(isEmpty()){
      lastLink = theNewLink;
    }else{
      firstLink.previous = theNewLink;
    }
    
    theNewLink.next = firstLink;
    firstLink = theNewLink;
  }
  
  public void insertInLastPosition(String name, int houseNumber){
    Neighbour theNewLink = new Neighbour(name, houseNumber);
    if(isEmpty()){
      firstLink = theNewLink;    
    }else{
      lastLink.next = theNewLink;
      theNewLink.previous = lastLink;
    }
    
    lastLink = theNewLink;
  }
  
  public boolean insertAfterAKey(String name, int number, int key){
    Neighbour theNewLink = new Neighbour(name, number);
    Neighbour currentNeighbour = firstLink;
    
    while(currentNeighbour.houseNumber != key){
      currentNeighbour = currentNeighbour.next;
      
      if(currentNeighbour == null){
         return false;
      }
    }  
    
    if(currentNeighbour == lastLink){
      theNewLink.next = null;
      lastLink = theNewLink;
    }else{
      theNewLink.next = currentNeighbour.next;
      currentNeighbour.next.previous = theNewLink;
    }
    
    theNewLink.previous = currentNeighbour;
     currentNeighbour.next = theNewLink;
     return true;
  }
  
  public void insertInOrder(String name, int number){
    Neighbour theNewLink = new Neighbour(name, number);
    Neighbour previousNeighbour = null;
    Neighbour currentNeighbour = firstLink;
    
    while((currentNeighbour != null) && (number > currentNeighbour.houseNumber))     {
      previousNeighbour = currentNeighbour;
      currentNeighbour  = currentNeighbour.next;
    }
    
    if(previousNeighbour == null){
      firstLink = theNewLink;
    }else{  
      previousNeighbour.next = theNewLink;
    }
    
    theNewLink.next = currentNeighbour;
    
  }
  
  public boolean isEmpty(){
    return(firstLink == null);
  }
  
  public void display(){
    
    Neighbour theLink = firstLink;
    
    while(theLink != null){
       theLink.display();
       System.out.println("Next Link: "  + theLink.next);
       theLink = theLink.next;
      
       System.out.println();
    }
    
    System.out.println("*******************************\n");
    
  }
  
  public static void main(String[] args) {
    Solution DoubleLinkedList = new Solution();
    //DoubleLinkedList.insertInFirstPosition("Arjun Dass", 7);
    //DoubleLinkedList.insertInFirstPosition("Aakash Verma", 17);
    //DoubleLinkedList.insertInFirstPosition("John Lenon", 23);
    //DoubleLinkedList.insertInFirstPosition("Mark Wahlberg", 21);  
    //DoubleLinkedList.display();
    
    DoubleLinkedList.insertInOrder("Arjun Dass", 7);
    DoubleLinkedList.insertInOrder("Aakash Verma", 17);
    DoubleLinkedList.insertInOrder("John Lenon", 23);
    DoubleLinkedList.insertInOrder("Mark Wahlberg", 21);  
    DoubleLinkedList.display();
    DoubleLinkedList.insertAfterAKey("Yash Gupta", 10, 2);
    DoubleLinkedList.display();
    
    System.out.println("\n");
    
    NeighbourIterator neighbours = new NeighbourIterator(DoubleLinkedList);
    neighbours.currentNeighbour.display();
    //System.out.println(neighbours.hasNext());
    neighbours.next();
    neighbours.currentNeighbour.display();
    neighbours.remove();
    neighbours.currentNeighbour.display();
  } 
}

class Neighbour{
  public String name;
  public int houseNumber;
  
  public Neighbour next;
  public Neighbour previous;
  
  public Neighbour(String name, int houseNumber){
    this.name = name;
    this.houseNumber = houseNumber;
  }
  
   public void display(){
    System.out.println(name + " : " + houseNumber + " Private Drive.");
   }
  
  public String toString(){
    return name;
  }
}

class NeighbourIterator{
  Neighbour currentNeighbour;
  Neighbour previousNeighbour;
  
  Solution theNeighbours;
   NeighbourIterator(Solution theNeighbours){
     this.theNeighbours = theNeighbours;
     currentNeighbour = theNeighbours.firstLink;
     previousNeighbour = theNeighbours.lastLink;
     
   }
  
  public boolean hasNext(){
    if(currentNeighbour.next != null){
      return true;  
    }else{ 
      return false;
    }
  }
  
  public Neighbour next(){
    if(hasNext()){
      previousNeighbour = currentNeighbour;
      currentNeighbour = currentNeighbour.next;
      return currentNeighbour;
    }
    return null;
  }
  
  public void remove(){
    if(previousNeighbour == null){
      theNeighbours.firstLink = currentNeighbour.next;
    }else{
      previousNeighbour.next = currentNeighbour.next; 
      
      if(currentNeighbour.next == null){
        currentNeighbour = theNeighbours.firstLink;
        previousNeighbour = null;
      }else{
        currentNeighbour = currentNeighbour.next; 
      }
    }
  }
    
}