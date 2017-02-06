import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
  
  private String[] stackArray;
  private int stackSize;
  private int top = -1;
  
  Solution(int size){
    stackSize = size;
    stackArray = new String[size];
    Arrays.fill(stackArray, "-1");
  }
  
  public void push(String input){
    if(top+1 < stackSize){
      top++;
      stackArray[top] = input;
    }else{
      System.out.println("\n Sorry but the stack is full.\n");
    }
    
    System.out.println("PUSH " + input + "was added to the stack\n");
    stackShow();    
  }
  
  public String pop(){
    if(top >=0){
      stackShow();
      System.out.println("\nPOP " + stackArray[top] + " was removed from the             stack \n");
      stackArray[top] = "-1";
      return stackArray[top--];
    }else{
      stackShow();
      System.out.println("\nSorry Stack is empty.\n"); 
      return "-1";
    }
  }
  
  public String peek(){
    stackShow();
    System.out.println("\n Peeked " + stackArray[top] + " is at the top of the       stack.\n");
    return stackArray[top];
  }
  
  public void stackShow(){
    System.out.println();
    for(int i=0; i<stackSize; i++){
      System.out.println("\n" + stackArray[i] + " | ");
    }
  }
  
  public void pushMultipleValues(String multiple){
    String[] tempString = multiple.split(" ");
    for(int i=0; i<tempString.length; i++){
      push(tempString[i]);
    }
  }
  
  public static void main(String[] args) {
    Solution stack = new Solution(10);
    stack.push("10");
    stack.pushMultipleValues("22 34 21 66 75 12 21");
    stack.peek();
    stack.pop();
    stack.peek();
    
  }
}
