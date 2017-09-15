import java.util.*;

class HammingDistance {
  
    public static int calculateDifferentChar(String x, String y, int differentCharacters){
        
      for(int i=0; i<x.length(); i++){
        if(x.charAt(i) == y.charAt(i)){
          continue;
        }else{
          differentCharacters++;
        }
      }
      
      return differentCharacters;
    }
    
    public static int hammingDistance(int x, int y){

      int differentCharacters = 0;
       
        String binary1 = Integer.toBinaryString(x);
        String binary2 = Integer.toBinaryString(y);

        int length1 = binary1.length();
        int length2 = binary2.length();
      
        if(length1 > length2){
          int numberOfcharacters = length1 - length2;
          for(int i=0; i<numberOfcharacters; i++){
            binary2 = "0" + binary2;
          }
          differentCharacters =calculateDifferentChar(binary1, binary2, differentCharacters);
        }else if(length2 > length1){
          int numberOfcharacters = length2 - length1;
          for(int i=0; i<numberOfcharacters; i++){
            binary1 = "0" + binary1;
          }
         differentCharacters =calculateDifferentChar(binary1, binary2, differentCharacters);
        }else{
            differentCharacters =calculateDifferentChar(binary1, binary2, differentCharacters);
        }
      
        return differentCharacters;
    }
    
    public static void main(String args[]){
        Scanner scan =  new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        System.out.println(hammingDistance(a, b));
        
    }
}