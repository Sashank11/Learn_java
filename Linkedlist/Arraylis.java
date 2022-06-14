import java.util.ArrayList;
public class Arraylis {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(2,25);
        // System.out.println(arr.size());
        // Integer i = 10;
        // arr.remove(i);
        for(int i = 0; i <arr.size(); i++){
            System.out.println(arr.get(i));
        }
        //  Enhanched for loop : for each loop iteration
        for(int i: arr){
            System.out.println(i);
        }
        // System.out.println(arr.get(3));
    }
}
