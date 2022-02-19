import java.util.*;

public class TakeInput {
    
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();    // nextInt() for integer, nextFloat() .....
        // sc.close();
        // System.out.println(name);
        System.out.println("Enter first number: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        sc.close();
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);

    }
}
