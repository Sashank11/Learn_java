public class QueueUsingArray {
    private int data[];
    private int front; // index of element at the front of the queue
    private int rear;  //  index of element at the rear of the queue
    private int size;
    public QueueUsingArray(){
        data = new int[5];
        front = -1;
        rear = -1;
    }

        public QueueUsingArray(int capacity){
        data = new int[capacity];
        front = -1;
        rear = -1;
    }

    
}
