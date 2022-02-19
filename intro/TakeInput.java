import java.util.*;

public class TakeInput {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();    // nextInt() for integer, nextFloat() .....
        sc.close();
        System.out.println(name);
    }
}
