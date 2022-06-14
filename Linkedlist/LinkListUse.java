import java.util.Scanner;

public class LinkListUse {

    public static Node<Integer> createLinkedList(){
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        return n1;
    }

    public static void print(Node<Integer> head){
        Node<Integer> current = head;
        while(current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.print("null");
    }
    public static Node<Integer> takeInput(){
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        Node<Integer> head = null, tail = null;
        while(data != -1){
            Node<Integer> current = new Node<Integer>(data);
            if(head == null){
                head = current;
                tail = current;
            }
            else{
                tail.next = current;
                tail = current;
            }
            data = s.nextInt();
        }
        return head;
    }
    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        print(head);
        // Node<Integer> n1 = new Node<>(10);
        // System.out.println(n1.data);
        // System.out.println(n1.next);
    }
}
