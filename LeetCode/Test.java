import java.util.*;

class Test{
    
    static int maxLength(int[] a, int k) {
        HashMap<ArrayList<Integer>, Integer> subArrays = new HashMap<ArrayList<Integer>, Integer>();
        ArrayList<Integer> possibleValues = new ArrayList<Integer>();
        int n = a.length;
        for(int i=0; i<n; i++){
            for(int j=i;j<n; j++){
                ArrayList<Integer> subarray = new ArrayList<Integer>();
                for(int l=i; l<=j; l++){
                    subarray.add(a[l]);
                }
                
                int sum = 0;
                for(int d: subarray){
                    sum += d;
                }
                
                subArrays.put(subarray, sum);
            }
        }
        
        Iterator it = subArrays.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry pair = (Map.Entry)it.next();
            if(((Integer) pair.getValue()) < k ){
                for(int i: pair.getKey().size()){
                    System.out.println(i);
                }
               
            }
        }
        
        return 0;//Collections.max(possibleValues);
    }

    
    public static void main(String args[]){
        int[] a = {1, 2, 2, 4};
        maxLength(a, 5);
    }
}