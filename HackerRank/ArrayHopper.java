class ArrayHopper{
    
    public static int getMinimumJumps(int a[]){
        
        // If the length of the array is less than 1, not possible to calculate jumps
        if(a.length <= 1){
            return 0;
        }

        // if the first element of the array is less 1, jumps are not possible
        if(a[0] <= 0){
            return -1;
        }

        // Initializing elements
        int jumps = 1;
        int maxReach = a[0];
        int steps = a[0];

        // not running from 0, coz we have already initialized variable with first elements values, considering other elements
        for(int i=1; i<a.length; i++){

            //check if we have reached the end of the array
            if(i == a.length - 1){
                return jumps;
            }

            //updating the maxReach
            maxReach = Math.max(maxReach, i+a[i]);
            steps--;

            if(steps == 0){
                // we have used a jump
                jumps++;

                //check if the current index or lesser index is the maximum reach point from the previous indexes
                if(i >= maxReach){
                    return -1;
                }

                steps = maxReach - 1;
            }
        }

        return -1;
    }
    public static void main(String args[]){
        
        int arr[] = new int[] {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(getMinimumJumps(arr));

    }
}