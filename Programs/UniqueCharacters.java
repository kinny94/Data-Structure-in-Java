import java.util.*;
public class Solution{
  
  private int[] array = new int[50];
  private int size = 10;
  
  public void createArray(){
    
    for(int i=0; i<10; i++){
      
      Random rand = new Random();
      int n = rand.nextInt(50);
      
      array[i] = n;
    }
    
  }
  public void BubbleSort(int[] a){
    
    for(int i=size-1; i>1; i--){
      for(int j=0; j<i; j++){
        if(array[j] > array[j+1]){
          swap(j+1, j);
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
  
  public void printArray(){
    
    System.out.println("\n");
    for(int i=0; i<size; i++){
      System.out.print(array[i] + " | ");
    }
  }
  
  public static void main(String args[]){
    int uniqueElements = 0;
    
    Solution sol = new Solution();
    sol.createArray();
    sol.printArray();
    
    sol.BubbleSort(sol.array);
    
    for(int i=0; i<sol.size; i++){
      if(sol.array[i] != sol.array[i+1]){
        uniqueElements++;
      }
    }
    
    System.out.println("\n\n Number of Unique elements  = " + uniqueElements);
  }
}