import java.io.*;
import java.util.*;

public class NumberComplement{
  
    public int findComplement(int num) 
    {
        int i = 0;
        int j = 0;
        
        while (i < num)
        {
            i += Math.pow(2, j);
            j++;
        }
        
        return i - num;
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int digit = scan.nextInt();
      
       System.out.println(findComplement(digit));
      
    } 
}