import java.util.*;
public class ReverseQueue {
    	public static void reverseQueue(Queue<Integer> input) {
		//Your code goes here
        if(input.isEmpty()){
            return;
        }
        int temp = input.poll();
        reverseQueue(input);
        input.add(temp);
    }
}
