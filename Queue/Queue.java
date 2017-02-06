import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
  
  private String[] queue;
  private int size;
  private int front, rear, numberOfItems = 0;
  
  Solution(int queueSize){
    size = queueSize;
    queue = new String[size];
    Arrays.fill(queue, "-1");
  } 
  
  public void enqueue(String input){
    if(numberOfItems + 1 <= size){
      queue[rear] = input;
      rear++;
      numberOfItems++;
      System.out.println("\nEnqueue: " + input + " was added to the Queue\n");
    }else{
      System.out.println("Sorry, but the Queue is full");
    }
    
    print();
  }
  
  public void dequeue(){
    if(numberOfItems > 0){
      System.out.println("\nDequeueue: " + queue[front] + " was removed.\n");
      queue[front] = "-1";
      front++;
      numberOfItems--;
    }else{
      System.out.println("\nQueue is Empty!!\n");
    }
    System.out.println();
    print();
  }
  
  public void peek(){
    System.out.println();
    print();
    System.out.print("\nThe first element is " + queue[front] + "\n");
  }
  
  public void print(){
    for(int i=0; i<size; i++){
      System.out.print(queue[i] + " | ");
    }
  }
  
  public static void main(String[] args) {
    Solution queue = new Solution(10);
    queue.enqueue("10");
    queue.enqueue("11");
    queue.enqueue("13");
    queue.enqueue("14");
    queue.enqueue("2");
    queue.enqueue("45");
    queue.enqueue("777");
    queue.enqueue("1543");
    queue.peek();
    queue.dequeue();
    queue.peek();
    queue.dequeue();
    queue.peek();
    
  }
}
