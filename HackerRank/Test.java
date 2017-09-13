import java.io.*;
import java.util.*;
public class Test {
    
        public static int jumps(int[] arr){
        
        int n = arr.length;
        
        if(arr[0] == 0){
            return 0;
        }
        
        int jumps[] = new int[n];
        int i, j;
        
        if(n == 0 || arr[0] == 0)
          return Integer.MAX_VALUE;
    
        jumps[0] = 0;
    
        for(i=1; i<n; i++){
            jumps[i] = Integer.MAX_VALUE;
            for(j = 0; j<i; j++){
                if(i<=j+arr[j] && jumps[j] != Integer.MAX_VALUE){
                    jumps[i] = Math.min(jumps[i], jumps[i] + 1);
                    break;
                }
            }
        }

        return jumps[n-1];
    }
    
    public static void main(String args[] ) throws Exception {
        
        int a[] = new int[10];
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<10; i++){
            a[i] = scan.nextInt();
        }
        
        System.out.println(jumps(a));
    }
}