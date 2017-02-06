import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
  
  private int[] array = new int[50];
  private int size = 10;
  
  public void createArray(){
    
    for(int i=0; i<10; i++){
      
      Random rand = new Random();
      int n = rand.nextInt(50);
      
      array[i] = n;
    }
    
  }
  
  public void printArray(){
    
    System.out.println("\n");
    for(int i=0;i<size; i++){
      System.out.print(array[i] + " | ");
    }
    
  }

  public void bubbleSortAscending(){
    
    for(int i= size-1; i>1;i--){
      for(int j=0; j<i; j++){
        if(array[j] > array[j+1]){
          swap(j+1, j);
        }
      }
    }
    
    System.out.println("\n\nSorted Array: Ascending:");
    printArray();
    
  }
  
   public void bubbleSortDescending(){
    
    for(int i= size; i>1;i--){
      for(int j=0; j<i; j++){
        if(array[j] < array[j+1]){
          swap(j+1, j);
        }
      }
    }
     
    System.out.println("\n\nSorted Array: Descending:");
    printArray();
  }
  
  public void swap(int one, int two){
    int temp = array[one];
    array[one] = array[two];
    array[two] = temp;
  }
  
  public static void main(String[] args) {
    
    Solution sol = new Solution();
    sol.createArray();
    sol.printArray();
    sol.bubbleSortAscending();
    sol.bubbleSortDescending();
  }
}