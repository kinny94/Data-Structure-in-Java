import java.util.*;

class InsertionSort{

    public static int[] sort(int[] a){
        for(int i=1; i<a.length; i++){
            int key = a[i];
            int j = i-1;

            while(j>=0 && a[j] > key){
                a[j+1] = a[j];
                j--;
            }

            a[j+1] = key;
        }
        return a;   
    }

    public static void print(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
    

    public static void main(String args[]){
        int[] numbers = {10, 5, 3, 7, 2};
        print(sort(numbers));
    }
}