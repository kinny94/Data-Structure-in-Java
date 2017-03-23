import java.util.*;

public class HackerRank{
    public static void main(String args[]){
        
       int x,s;

	   Scanner scan = new Scanner(System.in);
	   //System.out.println("Enter number of elements in an array: ");
	   x = scan.nextInt();

	   //System.out.println("\n Enter number of elements two be shifted: ");
	   s = scan.nextInt();

	   int[] a1 = new int[x];
	   int[] temp = new int[x];
       
       Scanner scan2 = new Scanner(System.in);
	   for(int i=0; i<x; i++){
			a1[i] = scan2.nextInt();
       }
        
       int var = 0;

	   for(int i=s; i<x; i++){
	   //System.out.println(a1[i]);
		  temp[var] = a1[i];
	      //System.out.println("temp[" + var + "] = " + a1[i]);
		      var++;
		}

	   for(int i=0; i<s; i++){
	       temp[var] = a1[i];
		   //System.out.println("temp[" + var + "] = " + a1[i]);
		   var++;
		}
        
        for(int i=0; i<temp.length; i++){
			System.out.print(temp[i] + " ");
		}
    }
}