import java.util.*;

public class Solution{
  private boolean x = true;
  public void sort(String[] array){
    Arrays.sort(array);
  }
  
  public boolean compareArray(String[] a1, String[] a2){
    if(a1.length == a2.length){
      for(int i =0; i<a1.length; i++){
        if(!a1[i].equals(a2[i])){
          x = false;
          break;
        }
        x  = true;
      }
    }else{
      x = false;
    }
    return x;
  }
  
  public static void main(String args[]){
    
    Solution sol = new Solution();
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter any number: ");
    
    int largest = 0;
    int number = scan.nextInt();
    String tempNumber = Integer.toString(number);
    String[] compareArray = tempNumber.split("");
    
    sol.sort(compareArray);
  
    for(int i=0; i<number; i++){
      String temp = Integer.toString(i);
      String[] newArray = temp.split("");
      sol.sort(newArray);
      sol.compareArray(newArray, compareArray);
      
      if((sol.x) && (i > largest)){
        largest = i;
      }
    }
    
    System.out.println(largest);
  }   
}