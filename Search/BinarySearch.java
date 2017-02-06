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
  
  
  public void bubbleSort(){
    
    for(int i=size-1; i>1; i--){
      for(int j=0; j<i; j++){
        
        if(array[j] > array[j+1]){
          swap(j, j+1);  
        }
        
      }
    }
    
    printArray();
    
  }
  
  public void swap(int one, int two){
    
    int temp = array[one];
    array[one] = array[two];
    array[two] = temp;
    
  }
  
  public void binarySearch(int value){
    int lowIndexValue = 0;
    int maxIndexValue = size-1;
    boolean found = false;
    
    while(lowIndexValue <= maxIndexValue){
      
      int middleIndex = (lowIndexValue + maxIndexValue)/2;
      
      if(array[middleIndex] < value){
        lowIndexValue = middleIndex + 1;
      }
      
      else if(array[middleIndex] > value){
        maxIndexValue = middleIndex - 1;
      }
      
      else{
        
          System.out.println("\n \nFound a match for " + value + " at Index " +             middleIndex );
        
          lowIndexValue = maxIndexValue + 10;
          found = true;
          
        
      }
     
      
    }
    
    if(found == false){
      System.out.println("\n\nElement not found!!");
    }
  }
  
  public static void main(String[] args) {
    Solution sol = new Solution();
    sol.createArray();
    sol.printArray();
    sol.bubbleSort();
    sol.binarySearch(11);
  }
}
