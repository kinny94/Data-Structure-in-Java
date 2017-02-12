import java.io.*;
import java.util.*;

public class Solution{
  
  private String[]  a = new String[50];
  private int size = 10;
  
  public void createArray(){
    Random rand = new Random();
    for(int i=0; i<size; i++){
      int n = rand.nextInt(50);
      a[i] = Integer.toString(n);
    }
  }
  
  public void printArray(){
    System.out.println("\n");
    for(int i=0; i<size; i++){
      System.out.print(a[i] + " | ");
    }
  }
  
  public void swap(int one, int two){
    String temp = a[one];
    a[one] = a[two];
    a[two] = temp;
  }
  
  public void BubbleSort(){
    for(int i=size-1; i>1; i--){
      for(int j=0; j<i; j++){
        if(Integer.parseInt(a[j]) > Integer.parseInt(a[j+1])){
          swap(j, j+1);
        }
      }
    }
  }
  
  public void nullAtLast(){}
  
  
  public void duplicates(){
    for(int i=0; i<size; i++){
      if(a[i].equals(a[i+1])){
        a[i] = null;
      }
    }  
  }
  
  
  public static void main(String args[]){
    Solution sol = new Solution();
    sol.createArray();
    sol.printArray();
    sol.BubbleSort();
    sol.printArray();
    sol.duplicates();
    sol.printArray();
  }
}