import java.util.*;

class BalancedSumArray{
    
    public static int findIndex(ArrayList<Integer> arr){
        int size = arr.size();
        int totalSum = 0;
        int sum = 0;

        for(int i=0; i<size; i++){
            totalSum += arr.get(i);
        }

        for(int i=0; i<size; i++){
            sum += arr.get(i);
            totalSum -= arr.get(i);

            if(sum == totalSum){
                System.out.println("totalSum : " + totalSum + " : : Sum : " + sum);
                System.out.println(i);
                return i;
            }
        }

        System.out.println("No");
        return 0;
    }

    public static void main(String args[]){
        ArrayList<Integer> a = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
            a.add(scan.nextInt());
        }

        findIndex(a);
    }
}