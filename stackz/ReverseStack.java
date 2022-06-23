import java.util.*;
public class ReverseStack {
    	public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
		//Your code goes here
        int temp =0;
        if(input.isEmpty()){
            return;
            
        }
        temp = input.pop();
        reverseStack(input, extra);
        while(!input.isEmpty()){
            extra.push(input.pop());
        }
    
        input.push(temp);
        while(!extra.isEmpty()){
            input.push(extra.pop());
        }
	}
    public static void main(String[] args) {
        Stack<Integer> input = new Stack<>();
        input.push(1);
        input.push(2);
        input.push(3);
        input.push(4);
        input.push(5);
        Stack<Integer> extra = new Stack<>();
        reverseStack(input, extra);
        System.out.println(input);

    }
}
