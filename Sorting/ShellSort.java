import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
  
  private int[] theArray;
  private int arraySize;
  
  Solution(int arraySize){
    this.arraySize = arraySize;
    theArray = new int[arraySize];
    generateRandomArray();
  }
  
  public void sort(){
    int inner, outer, temp;
    int interval = 1;
    while(interval <= arraySize /  3){
      interval = interval * 3;
      while(interval > 0){
        for(outer = interval; outer < arraySize; outer++){
          temp = theArray[outer];
          System.out.println("Copy " + theArray[outer] + " into temp.");
          inner = outer;
          System.out.println("Checking if " + theArray[inner - interval] + " in index " + (inner - interval) + " is bigger than " +  temp);
          
          while(inner > interval - 1 && theArray[inner - interval] >= temp){
            System.out.println("In while checking if " + theArray[inner - interval] + " in index " + (inner - interval) + " is bigger than " + temp);
            
            //print(inner, outer, interval);
            theArray[inner] = theArray[inner - interval];
            System.out.println(theArray[inner - interval] + " moved to index" + inner);
            
            inner -= interval;
            System.out.println(" inner = " + inner);
            
          }
          theArray[inner] = temp;
          System.out.println(temp + " moved to index " + inner);
          //print();
        }
        interval = (interval -1)/ 3; 
      }
    }
  }
  
  public void print(int i, int j, int h){
    if(i == j){
      i = i -h;
    }
    
    for(int n = 0; n < 51; n++){
      System.out.println("-");
    }
    
    System.out.println();
    for(int n = 0; i<arraySize; i++){
      System.out.println(" | " + n + "  ");
    }
    
    System.out.println("|");
    
    for(int n=0; n<51; n++){
      System.out.println("-"  );
    }
  }
  
  public void generateRandomArray(){
    for(int i=0; i<arraySize; i++){
      theArray[i] = (int) (Math.random() * 50) + 10;
    }
  }
  
  public static void main(String[] args) {
      Solution sort = new Solution(10);
      System.out.println(Arrays.toString(sort.theArray));
      sort.sort();                
  }
                         
}