import java.util.*;

/*
    Best Case: O(n2)
    Average Case: O(n2)
    Worst Case: O(n2)

*/
class SelectionSort{
    
    public static void print(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }

    public static int[] sort(int a[]){
        for(int i=0; i<a.length -1 ;i++){
            int minIndex = i;

            for(int j=i+1; j<a.length; j++){
                if(a[j] < a[minIndex]){
                    minIndex = j;
                }
            }

            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }

        return a;
    }

    public static void main(String args[]){
        int[] numbers = {10, 5, 3, 7, 2};
        print(sort(numbers));
    }
}