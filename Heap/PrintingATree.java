import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
  
  public void printTree(int rows){
    int spaces = 0;
    int iterator = 1;
    
    while(iterator < rows){
      int indent = (int) Math.abs((Math.pow(-2, -iterator)) * (-16 + (Math.pow(2, iterator))));
      int indexToPrint = (int) (0.5 * (-2 + (Math.pow(2, iterator))));
      int itemsPerRow = (int) Math.pow(2, iterator - 1);
      int maxIndexToPrint = indexToPrint + itemsPerRow;
      
      for(int j=0; j<indent; j++){
        System.out.println(" ");
      }
      
      for(int l=indexToPrint; l<maxIndexToPrint; l++){
        System.out.println(theHeap[l].key); 
      }
      
      for(int k=0; k<spaces; k++){
        System.out.println(" ");
      }
      
      spaces = indent;
      iterator++;
      System.out.println();
    }
  }
  
  public static void main(String[] args) {
    
  }
}
