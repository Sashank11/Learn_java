public class QueueUse {
    
    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray();
        int arr[] = {1,2,3,4};
        for(int element : arr){
            queue.enqueue(element);
        }
        while(!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }
    }
}
