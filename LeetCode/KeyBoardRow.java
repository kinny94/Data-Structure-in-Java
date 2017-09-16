import  java.util.*;

class KeyBoardRow {
    
    public static boolean checkString(String word, String row){
        boolean flag = true;;
        for(int i=0; i<word.length(); i++){  
          if(row.indexOf(String.valueOf(word.charAt(i))) == -1){
                flag = false;
                return flag;
            }  
        }
        
        //System.out.println(flag);
        return flag;
    }
    public static String[] findWords(String[] words) {
        
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
      
        ArrayList<String> wordsThatCanBeFormed = new ArrayList<String>();
        
        
        for(int i=0; i<words.length; i++){
          
            boolean x, y, z;
            String currentWord = words[i].toLowerCase();
            x = checkString(currentWord, row1);
            y = checkString(currentWord, row2);
            z = checkString(currentWord, row3);
          
            if(x || y || z){
              wordsThatCanBeFormed.add(words[i]); 
            }
        }
        
       //System.out.println(wordsThatCanBeFormed.toString());
      
      String[] arr = wordsThatCanBeFormed.toArray(new String[wordsThatCanBeFormed.size()]);
      return arr;
        
    }
  
    public static void main(String args[]){
      String[] a = {"Hello" ,"Aslaska", "Dad", "Peace", "yu"};
      System.out.println(Arrays.toString(findWords(a)));
    }
}