import java.util.*;

class MinimumUniqueArraySum{
    
    public static int calculate(ArrayList<Integer> arr){
        Collections.sort(arr);
        int size = arr.size();
        System.out.println(size);
        int sum = arr.get(0);
        int prev = arr.get(0);

        for(int i=1; i<size; i++){
            int curr = arr.get(i);

            if(prev >= curr){
                curr = prev + 1;
            }

            sum += curr;
            prev = curr;
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String args[]){
        ArrayList<Integer> a = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
            a.add(scan.nextInt());
        }
        calculate(a);
    }
}