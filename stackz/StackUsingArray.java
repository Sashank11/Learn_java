public class StackUsingArray{

    private int data[];
    private int topIndex; // index of top most element of the stack

    public StackUsingArray(){
        data = new int[10];
        topIndex = -1;
    }
    public StackUsingArray(int size){
        data = new int[size];
        topIndex = -1;
    }
    public int size(){
        return topIndex + 1;
    }

    public boolean isEmpty(){
        return topIndex == -1;
    }

    public void push(int elem){
        // if stack is full
        if(topIndex == data.length-1){
            Exception e = new Exception("stack is full");
            System.out.println(e);
        }
        topIndex++;
        data[topIndex] = elem;
    }
    public int top(){
        if(topIndex == -1){
            return -1;
        }
        return data[topIndex];
    }

    public int pop(){
        if(topIndex == -1){
            return -1;
        }
        int temp = data[topIndex];
        topIndex--;
        return temp;
    }

    
}