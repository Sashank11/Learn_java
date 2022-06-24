import java.util.*;
public class RevK {
    public static void reverseQueue(Queue<Integer> input) {
		//Your code goes here
        if(input.isEmpty()){
            return;
        }
        int temp = input.poll();
        reverseQueue(input);
        input.add(temp);
    }
    public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
        Queue<Integer> output = new LinkedList<Integer>();
        for(int i = 0; i <k; i++){
            int temp = input.poll();
            output.add(temp);
        }
        reverseQueue(output);
        while(!(input.isEmpty())){
            int t = input.poll();
            output.add(t);
        }
        return output;
	}

}
