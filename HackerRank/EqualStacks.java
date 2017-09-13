import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EqualStacks {

    public static <T> void reverseStack(Stack<T> stack) {
        if (stack.isEmpty()) {
            return;
        }
        // Remove bottom element from stack
        T bottom = popBottom(stack);
        
        // Reverse everything else in stack
        reverseStack(stack);
        
        // Add original bottom element to top of stack
        stack.push(bottom);
    }
    private static <T> T popBottom(Stack<T> stack) {
        T top = stack.pop();
        if (stack.isEmpty()) {
            // If we removed the last element, return it
            return top;
        } else {
            // We didn't remove the last element, so remove the last element from what remains
            T bottom = popBottom(stack);
            // Since the element we removed in this function call isn't the bottom element, add it back onto the top of the stack where it came from
            stack.push(top);
            return bottom;
        }
    }
  
    private static int calculateSize(Stack<Integer> stack){
        int height = 0;
      
        if(!stack.isEmpty()){
            for(int element: stack){
              height += element;
          }
        }
        
        return height;
    }
  
    public static int maxHeight(Stack<Integer> a, Stack<Integer> b, Stack<Integer> c){
        
        boolean maxHeight = false;
        int size1 = calculateSize(a);
        int size2 = calculateSize(b);
        int size3 = calculateSize(c);
    
        reverseStack(a);
        reverseStack(b);
        reverseStack(c);

        if(size1 == size2  && size2 == size3 && size3 == size1){
            return size1;
        }
            
          
            // do the pop operations
        while(size1 != size2 && size2 != size3 && size3 != size1){
          
            System.out.println(size3);
          
            if(size1 == 0 || size2 == 0 || size3 == 0){
                System.out.println("I ran!");
                maxHeight = true;
                break;
            }else if(size1 > size2 && size1 > size2){
                size1 = size1 - a.peek();
                a.pop(); 
            }else if(size2 > size1 && size2 > size3){
              size2 = size2 - b.peek();
              b.pop();
            }else if(size3 > size2 && size3 > size1){
               size3 = size3 - c.peek();
               c.pop();
            }else if(size1 == size2 && size1 > size3){
                size1 = size1 - a.peek();
                size2 = size2 - b.peek();
                a.pop();
                b.pop();
            }else if(size2 == size3 && size2 > size1){
                size3 = size3 - c.peek();
                size2 = size2 - b.peek();
                c.pop();
                b.pop();
            }else if(size3 == size1 && size3 > size2){
                size1 = size1 - a.peek();
                size3 = size3 - c.peek();
                a.pop();
                c.pop();
            }
        }
      
      if(!maxHeight){
          return size1; 
      }else{
        return 0; 
      }
      
        
    }
  
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        
        Stack<Integer> stack1 = new Stack<Integer>();
        for(int h1_i=0; h1_i < n1; h1_i++){
            stack1.push(in.nextInt());
        }
        
        Stack<Integer> stack2 = new Stack<Integer>();
        for(int h1_i=0; h1_i < n2; h1_i++){
            stack2.push(in.nextInt());
        }
        
        Stack<Integer> stack3 = new Stack<Integer>();
        for(int h1_i=0; h1_i < n3; h1_i++){
            stack3.push(in.nextInt());
        }
        
        System.out.println("Maximum Height is : " + maxHeight(stack1, stack2, stack3));
        
    }
}