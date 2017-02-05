import java.io.*;
import java.util.*;


class Solution {
  
  private int[] array = new int[50];
  private int size = 10;
  
  public void generateRandom(){
    
    Random rand = new Random();
    
    for(int i=0; i<size; i++){
      
      int n = rand.nextInt(50);
      array[i] = n;
      
    }
    
  }
  
  public void searchValue(int value){
    boolean found = false;
    String indexWithValues = "";
    
    for(int i=0;i <size; i++){
      if(array[i] == value){
        found = true;
        System.out.println(i + " ");
        System.out.println("\nThe element was found @ : ");
        indexWithValues += i + " ";
        System.out.println(indexWithValues);
      }
    }
    
    if(found == false){
      System.out.println("\nElement not found!!");
    }
                       
  }
  
  
  public void search(int toBeSearched){
    boolean found = false;
    for(int i=0; i<size; i++){
      if(toBeSearched == array[i]){
        found = true;
        System.out.println("Element " + toBeSearched + " found at position " +           i);
      } 
    }
    
    if(found == false){
        System.out.println("Element not found!!");
      }
    
  }
  
  public void delete(int deleteThisIndex){
      if(deleteThisIndex < size){
        for(int i= deleteThisIndex; i< (size-1); i++){
          array[i] = array[i+1];
        }
        size--;
        print();
      }
  }
  
  public void insert(int insertThis){
    if(size < 50){
      array[size] = insertThis;
      size++;
      System.out.println("\n After Insertion \n");
      print();
    }
  }
  
  public void getValue(int index){
    if(index<size){
      System.out.println("\n Value at " + index + " is " + array[index]); 
    }
  }
  
  public void print(){
    for(int i=0; i<size; i++){
       System.out.print(array[i] + " | ");
    }
  }  
  public static void main(String[] args) {
    
    Solution sol = new Solution();
    sol.generateRandom();
    sol.print();
    sol.getValue(4);
    sol.search(22);
    sol.delete(2);
    sol.insert(55);
    sol.searchValue(21);
  }
}
