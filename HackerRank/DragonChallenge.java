import java.io.*;
import java.util.*;
public class DragonChallenge {
    
        public static ArrayList<Integer> jumps(ArrayList<Integer> arr){
        
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        int n = arr.size();
        
        if(arr.get(0) == 0){
           System.out.println("failure"); 
           return null;
        }
        
        int jumps[] = new int[n];
        int i, j;
        
        if(n == 0 || arr.get(0) == 0){
           int maxValue = Integer.MAX_VALUE;
           System.out.println(maxValue); 
        }
          
    
        jumps[0] = 0;
    
        for(i=1; i<n; i++){
            jumps[i] = Integer.MAX_VALUE;
            for(j = 0; j<i; j++){
                if(i<=j+arr.get(j) && jumps[j] != Integer.MAX_VALUE){
                    jumps[i] = Math.min(jumps[i], jumps[j] + 1);
                    break;
                }
            }
        }
        
        System.out.println();
            
        for(int k=0; k<jumps.length - 1; k++){
            if(jumps[k] != jumps[k+1]){
                indexes.add(k);
            }
        }
        indexes.add(jumps.length-1);
    
        return indexes;    
            
    }
    
    public static void main(String args[] ) throws Exception {
        
        ArrayList<Integer> input = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> output = new ArrayList<Integer>();

        //for(int i=0; i<10; i++){
        //    a[i] = scan.nextInt();
        //}
        
        while(scan.hasNextInt()){
            input.add(scan.nextInt());
        }
        
        output = jumps(input);
        
        String answer = "";
        for(int element: output){
            answer += Integer.toString(element)+", ";  
        };
        answer += "out";
        System.out.print(answer);
    }
}