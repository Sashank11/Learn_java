public class StackUsingArray{

    private int data[];
    private int topIndex; // index of top most element of the stack

    public StackUsingArray(){
        data = new int[2];
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
            doubleCapacity();
        }
        topIndex++;
        data[topIndex] = elem;
    }
    private void doubleCapacity() {
        int temp[] = data;
        data = new int[2* temp.length];
        for(int i =0; i <temp.length; i++){
            data[i] = temp[i];
        }
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