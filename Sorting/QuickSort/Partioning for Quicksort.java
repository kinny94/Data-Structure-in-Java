import java.io.*;
import java.util.*;

class Solution {
  
  private static int[] array;
  private static int size;
  
  Solution(int arraySize){
    size = arraySize;
    array =  new int[size];
    generateRandom();
  }
  
  public void generateRandom(){
    for(int i=0; i<size; i++){
      array[i] = (int) (Math.random() * 50) + 10;
    }
  }
  
  public int partioningArray(int pivot){
     int left = -1;
     int right = size;
    
     while(true){
      while((left < (size-1)) && (array[++left] < pivot));
      print(left, right);
      System.out.println(array[left] + " in index " + left + " is bigger than         the pivot value " + pivot ); 
       
      while((right > 0 ) && (array[--right] > pivot));
      print(left, right);
      System.out.println(array[right] + " in index " + right + " is smaller than         the pivot value " + pivot );
       print(left, right);
       
       if(left >= right){
          break;
       }else{
        swap(left, right);
        System.out.println(array[left] + " was swapped for " + array[right]);
       }
     }
    swap(left,right);
    return left;
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
  public static void main(String[] args) {
    Solution patitioning = new Solution(10);
    patitioning.generateRandom();
    System.out.println(Arrays.toString(Solution.array));
    patitioning.partioningArray(35);  
    System.out.println(Arrays.toString(Solution.array));
  }
}
