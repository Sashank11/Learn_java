public class StackUse {
    public static void main(String[] args) {
        
        StackUsingArray stack = new StackUsingArray();
        stack.push(10);
        System.out.println(stack.top());
        stack.pop();
        stack.size();
        System.out.println(stack.isEmpty());
    }
}
