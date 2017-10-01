import java.util.*;

class MergeString{

    public static String merge(String string1, String string2){
        String answer = "";
        int length1 = string1.length();
        int length2 = string2.length();
        String biggerString;

        if(length1 > length2){
            biggerString = string1;
        }else{
            biggerString = string2;
        }

        int n = Math.min(length1, length2);
        for(int i=0; i<n; i++){
            answer += String.valueOf(string1.charAt(i)) + String.valueOf(string2.charAt(i));
        }

        for(int i=n; i<biggerString.length(); i++){
            answer += String.valueOf(biggerString.charAt(i));
        }

        return answer;
    }

    public static void main(String args[]){
        String string1;
        String string2;
    
        Scanner scan = new Scanner(System.in);
        string1 = scan.nextLine();
        string2 = scan.nextLine();
        
        System.out.println(merge(string1, string2));
    }
}