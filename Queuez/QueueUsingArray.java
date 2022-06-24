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

    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }

    public void enqueue(int elem){
        if(front == -1){
            front++;
            rear++;
            data[front] = elem;
        }
        else{
            rear++;
            if(rear == data.length){
                rear = 0;
            }
            data[rear] = elem;
        }
        size++;
    }

    public int front(){
        if(size == 0){
            return -1;
        }
        return data[front];
    }

    public int dequeue(){
        int temp = data[front];
        front++;
        if(front == data.length){
            front = 0;
        }
        size--;
        if(size == 0){
            front = -1;
            rear = -1;
        }
        return temp;

    }
}
