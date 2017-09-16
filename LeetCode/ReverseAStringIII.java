class ReverseAStringIII {
    
         public static String reverseWords(String s) {
            String[] str = s.split(" ");
            for (int i = 0; i < str.length; i++) str[i] = new StringBuilder(str[i]).reverse().toString();
            StringBuilder result = new StringBuilder();
            for (String st : str) result.append(st + " ");
            return result.toString().trim();
        } 
      
        public static void main(String args[]){
          
          String s = "Let's take LeetCode contest";
          System.out.println(reverseWords(s));       
        }
    }