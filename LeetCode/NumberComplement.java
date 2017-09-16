import java.io.*;
import java.util.*;

public class NumberComplement{
  
    
    public static int findComplement(int digit){
        
      StringBuilder binary = new StringBuilder(Integer.toBinaryString(digit));
      
      for(int i=0; i<binary.length(); i++){
          if(String.valueOf(binary.charAt(i)).equals("1")){
              binary.setCharAt(i, '0');
          }else {
            binary.setCharAt(i, '1');
          }
      }
      
      int complement = Integer.parseInt(binary.toString(), 2);
      
      return complement;
    }
  
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int digit = scan.nextInt();
      
       System.out.println(findComplement(digit));
      
    } 
}