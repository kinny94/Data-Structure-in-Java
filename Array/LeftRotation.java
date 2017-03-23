import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LeftRotation {

   public static void main(String args[]){
        
       int x=0,s=0;

	   Scanner scan = new Scanner(System.in);
       if(scan.hasNextInt()){
           x = scan.nextInt();
       }
       
	   if(scan.hasNextInt()){
           s = scan.nextInt();
       }

	   int[] a1 = new int[x];
	   int[] temp = new int[x];
       
	   for(int i=0; i<x; i++){
			if(scan.hasNextInt()){
                a1[i] = scan.nextInt();
            }
       }
        
       int var = 0;

	   for(int i=s; i<x; i++){
		  temp[var] = a1[i];
		      var++;
		}

	   for(int i=0; i<s; i++){
	       temp[var] = a1[i];
		   var++;
		}
        
        for(int i=0; i<temp.length; i++){
			System.out.print(temp[i] + " ");
		}
    }
}
