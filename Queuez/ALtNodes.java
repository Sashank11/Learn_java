public class ALtNodes {
    public static void deleteAlternateNodes(Node<Integer> head) {
        //Your code goes here
        Node<Integer> curr = head;
        Node<Integer> temp = head;
        while (temp.next != null && curr.next != null) {
            temp = curr;
            curr = curr.next.next;
            temp.next = curr;
        }


    }
}
