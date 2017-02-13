import java.util.*;

public class Solution{
  
  private boolean yo = true;
  
  public void print(String[] array){
    System.out.println();
    for(String w: array){
      System.out.print(w + " | ");
    }
  }
  
  public void sort(String[] array){
    Arrays.sort(array);  
  }
  
  public boolean check(String[] a1, String[] a2){   
    if(a1.length == a2.length){
        for(int i =0; i<a1.length; i++){
          
          if(!a1[i].equals(a2[i])){
            yo = false;
            break;
          } 
        }  
      }else{
        System.out.println("\nlength not same\n");
        yo = false;
      }
     
      System.out.println(yo);
      return yo;
  }
  
  public static void main(String args[]){
    
    String s1, s2;
    
    Scanner scan = new Scanner(System.in);
    System.out.println("\n Enter String 1: ");
    s1 = scan.nextLine().toLowerCase();
    
    System.out.println("\n Enter String 2: ");
    s2 = scan.nextLine().toLowerCase();
    
    String[] a1 = s1.split("");
    String[] a2 = s2.split("");
    
    Solution sol = new Solution();
    sol.sort(a1);
    sol.sort(a2);
    sol.print(a1);
    sol.print(a2);
    
    if(sol.check(a1, a2)){
      System.out.println("\n Anagram");
    }else{
      System.out.println("\n Not anagram");
    }
  }
}