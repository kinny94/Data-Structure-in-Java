import java.util.*;

class BubbleSort{

    public void bubbleSort(int[] array){
        boolean isSorted = false;
        while(!isSorted){
            isSorted = true;
            for(int i=0; i<array.length - 1; i++){  // -1 because we will get array out of bound coz of i+1coparison
                if(array[i] > array[i+1]){
                    swap(array, i, i+1);
                    isSorted = false;
                }
            }
        }

    }

    public void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String args[]){
        
    }
}