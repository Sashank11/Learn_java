import java.util.ArrayList;
public class Arraylis {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(2,25);
        System.out.println(arr.size());
        Integer i = 10;
        arr.remove(i);
        System.out.println(arr.get(3));
    }
}
