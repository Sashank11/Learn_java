import java.util.*;
public class Brackets {
    public static boolean isBalanced(String expression) {
        //Your code goes here
        Stack<Character> stack = new Stack<>();
        for(int c = 0; c<expression.length(); c++){
            if(expression.charAt(c) == '{' || expression.charAt(c) == '(' || expression.charAt(c) == '['){
                stack.push(expression.charAt(c));
            }
            if(expression.charAt(c) == '}'){
                if(stack.isEmpty() == true){
                    return false;
                }
                if(stack.peek() == '}'){
                    stack.pop();
                }else{
                return false;
            }
            }
            if(expression.charAt(c) == ')'){
                if(stack.isEmpty() == true){
                    return false;
                }
                if(stack.peek() == '('){
                    stack.pop();
                }else{
                return false;
            }
            }
            if(expression.charAt(c) == ']'){
                if(stack.isEmpty() == true){
                    return false;
                }
                if(stack.peek() == '['){
                    stack.pop();
                }else{
                return false;
            }
            }
        }
        
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expression = "{{}";
        System.out.println(isBalanced(expression));
    }
}
