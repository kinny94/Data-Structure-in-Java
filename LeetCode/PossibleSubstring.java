import java.util.*;

class PossibleSubstring
{
    public static void allString(String string, int length){
        
        ArrayList<String> strings = new ArrayList<String>();
        
        for(int c = 0 ; c < string.length(); c++ )
        {
            for(int i = 1 ; i <=string.length() - c ; i++ )
            {
                String sub = string.substring(c, c+i);
                if(sub.length() == length){
                    strings.add(sub);
                }
            }
        }
        Collections.sort(strings);
        System.out.println(strings.toString());
    }
    
    public static void main(String args[])
    {
        String string, sub;
        int i, c, length;
        
        Scanner in = new Scanner(System.in);
        string  = in.nextLine();
        length = in.nextInt();   
        allString(string, length);
    }
}