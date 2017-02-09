import java.io.*;
import java.util.*;

class Solution {

  public static int[] array;
  public static int size;
  
  Solution(int newSize){
    size = newSize;
    array = new int[size];
    generateArray();
  }
  
  public void generateArray(){
    for(int i=0; i<size; i++){
      array[i] = (int) (Math.random() * 50) + 10;
    }
  }
public void swap(int one, int two){
    int temp = array[one];
    array[one] = array[two];
    array[two] = temp;
  }
  
  public void print(int i, int j){
      for (int n = 0; n < 61; n++)
        System.out.print("-");

        System.out.println();

        for (int n = 0; n < size; n++) {
            System.out.format("| %2s " + " ", n);
         }

        System.out.println("|");

        for (int n = 0; n < 61; n++)
            System.out.print("-");

        System.out.println();

        for (int n = 0; n < size; n++) {
          System.out.print(String.format("| %2s " + " ", array[n]));
        }

        System.out.println("|");

        for (int n = 0; n < 61; n++)
            System.out.print("-");

        System.out.println();

        if (i != -1) {
        int spacesBeforeFront = 5 * i + 1;

            for (int k = 0; k < spacesBeforeFront; k++)
                System.out.print(" ");

            System.out.print("L");

            int spacesBeforeRear = (5 * j + 1 - 1) - spacesBeforeFront;

            for (int l = 0; l < spacesBeforeRear; l++)
              System.out.print(" ");
            
            System.out.print("H");
            System.out.println("\n");
        }
  }
  
  public void quickSort(int left, int right){
    if((right - left) <= 0){
      return;
    }else{
      int pivot = array[right];
      System.out.println("Value in right " + array[right] + " is made the             pivot");
      System.out.println("left = " + left + "right = " + right + " pivot = " +         pivot + " sent to be partitioned.");
    
      int pivotLoc = partitionArray(left, right, pivot);
      System.out.println("\n Value is left " + array[left] + " is made the             pivot");
    
      quickSort(left, pivotLoc - 1);
      quickSort(pivotLoc + 1, right);
    }
  }
  
  public int partitionArray(int left, int right, int pivot){
    int leftPointer = left - 1;
    int rightPointer = right;
    
    while(true){
      while(array[++leftPointer] < pivot);
      print(leftPointer,rightPointer);
      
      System.out.println(array[leftPointer] + " in index " + leftPointer + " is bigger than the pivot value " + pivot);
      
      while((rightPointer > 0) && array[--rightPointer] > pivot);
      print(leftPointer, rightPointer);
      
      System.out.println(array[rightPointer] + " in index " + rightPointer + " is       smaller than the pivot value " + pivot);
    
      print(leftPointer, rightPointer);
      
      if(leftPointer >=  rightPointer){
        System.out.println("left is >= right so start again");
        break;
      }else{
        swap(leftPointer, rightPointer);
        System.out.println(array[leftPointer] + " was swapped for " +                   array[rightPointer]);
      }
    }
    swap(leftPointer, right);
    return leftPointer;
  }
  
  public static void main(String[] args) {
    Solution quicksort = new Solution(10);
    quicksort.generateArray();
    System.out.println(Arrays.toString(Solution.array));
    quicksort.quickSort(0, 9);
    System.out.println(Arrays.toString(Solution.array));
  }
}
