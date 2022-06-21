public class StackUsingLL<T> {
    private Node<T> head;
    private int size;

    public StackUsingLL(){
        head = null;
        size = 0;
    }
    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size ==0;
    }

    public void push(T elem){
        Node<T> curr = new Node<>(elem);
         curr.next = head;
         head = curr;
         size++;
        // if(head == null){
        //     head = (Node<T>) elem;
        //     size++;
        // }
        // else{
        //     head.next = curr;
        //     head = curr;
        //     size++;
        // }
    }
    public T top(){
        if(head == null){
            return  null;
        }
        return head.data;
    }

    public T pop(){
        if(head == null){
            return  null;
        }
        T temp = head.data;
        head = head.next;
        size--;
        return temp;
    }
}
