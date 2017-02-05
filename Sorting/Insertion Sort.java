import java.io.*;
import java.util.*;

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
  
  public void InsertionSort(){
    for(int i=1; i<size; i++){
      int j = i;
      int insertTo = array[i];
      
      while((j>0) && (array[j-1] > insertTo)){
        array[j] = array[j-1];
        j--;
      }
      array[j] = insertTo;
    } 
    printArray();
  }

  
  public static void main(String[] args) {
    
    Solution sol = new Solution();
    sol.createArray();
    sol.printArray();
    sol.InsertionSort();
  }
}
