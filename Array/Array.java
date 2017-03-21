
public class Array{
    public static void main(String args[]){

        int num[] = new int[5];

        for(int i=0; i<num.length; i++){
            num[i] = i;
        }
        
        //O(1)
        System.out.println("Element at 3: " + num[3]);

        //Searching O(N) --> O(logN) binary trees --> O(1) hashtables
        for(int i=0; i<num.length; i++){
        	if(num[i] == 4){
        		System.out.println("Match found at : " + i);
        	}
        }
    }
}