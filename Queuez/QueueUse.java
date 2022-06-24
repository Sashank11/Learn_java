public class QueueUse {
    
    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray(3);
        int arr[] = {1,2,3};
        for(int element : arr){
            queue.enqueue(element);
        }
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        while(!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }
    }
}
