import java.util.*;
/*
    Best Case: O(nlogn)
    Average Case: O(nlogn)
    Worst Case: O(n2)
*/

public class QuickSort{
    
    public static int[] sort(int a[]){
        sort(a, 0, a.length - 1);
        return a;
    }
    
    public static void print(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }

    public static void sort(int a[], int left, int right){
        if(left >= right){
            return;
        }

        int pivot =  a[(left + right) / 2];
        int index = partition(a, left, right, pivot);
        sort(a, left, index - 1);
        sort(a, index, right);
    }

    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int partition(int a[], int left, int right, int pivot){
        while(left <= right){
            while(a[left] < pivot){
                left++;
            }

            while(a[right] > pivot){
                right--;
            }

            if(left <= right){
                swap(a, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    public static void main(String args[]){
        int numbers[] = {10, 5, 3, 7, 2};
        print(sort(numbers));
    }
}