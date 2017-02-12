import java.io.*;
import java.util.*;

public class Solution{
  
  private String[] array = new String[50];
  private int size = 10;
  
  
  public void createArray(){
    int k=0;
    for(int i=0; i<size-1; i++){
      char n = (char)(97 + (k++));
      array[i] = Character.toString(n);
    }
  }
  
  public void reverse(){
    int tempSize = size;
    int temp = tempSize/2;
    for(int i=0; i<10; i++){
      if(i<temp){
        String tempo = array[i];
        array[i] = array[tempSize-1];
        array[tempSize-1] = tempo;
        
        tempSize--;
      }else{
        i = 10;
      }
    }
    System.out.println("\n\n Array reversed!\n");
  }
  
  
  public void printArray(){
    System.out.println("\n");
    for(int i=0; i<size; i++){
      System.out.print(array[i] + " | ");
    }
  }
  public static void main(String args[]){
    Solution sol = new Solution();
    sol.createArray();
    sol.printArray();
    sol.reverse();
    sol.printArray();
  }
}