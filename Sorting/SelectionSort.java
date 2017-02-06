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
  
  public void swap(int one, int two){
    int temp = array[one];
    array[one] = array[two];
    array[two] = temp;
  }
  
  public void selectionSort(){
    
    for(int i=0; i<size; i++){
      int min = i;
      
      for(int j=i; j<size; j++){
        if(array[min] > array[j]){
          min = j;
          
        }
      }
      
      swap(i, min);
      
    }
    
    printArray();
    
  }

  
  public static void main(String[] args) {
    
    Solution sol = new Solution();
    sol.createArray();
    sol.printArray();
    sol.selectionSort();
  
  }
}
