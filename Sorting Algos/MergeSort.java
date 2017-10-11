import java.util.*;

public class MergeSort{

    public static int[] sort(int a[], int leftStart, int rightEnd){
        int temp[] = new int[a.length];

        if(leftStart >= rightEnd){
            return a;
        }

        int middle = (leftStart + rightEnd) / 2;
        sort(a, leftStart, middle);
        sort(a, middle + 1, rightEnd);
        mergeHalves(a, temp, leftStart, rightEnd);

        return a;
    }

    public static void mergeHalves(int a[], int temp[], int leftStart, int rightEnd){
        int leftEnd = (rightEnd + leftStart) / 2;
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        while(left <= leftEnd && right <= rightEnd){
            if(a[left] <= a[right]){
                temp[index] = a[left];
                index++;
                left++;
            }else{
                temp[index] = a[right];
                right++;
            }

            index++;
        }

        System.arraycopy(a, left, temp, index, leftEnd - left + 1);
        System.arraycopy(a, right, temp, index, rightEnd - right + 1);
        System.arraycopy(temp, leftStart, a, leftStart, size);
    }

    public static void print(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String args[]){
        int numbers[] = {10, 5, 3, 7, 2};
    }
}