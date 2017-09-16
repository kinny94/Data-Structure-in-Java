import java.util.*;

class Judge_Route_Circle {
    public static boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for (char ch : moves.toCharArray()) {
            if (ch == 'U') y++;
            else if (ch == 'D') y--;
            else if (ch == 'R') x++;
            else if (ch == 'L') x--;
        }
        return x == 0 && y == 0;
    }
    
    public static void main(String args[]){
        String x;
        Scanner scan = new Scanner(System.in);
        x = scan.nextLine();
      
        System.out.println(judgeCircle(x.toUpperCase()));
    }
  
}