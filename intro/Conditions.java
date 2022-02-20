import java.util.*;

public class Conditions {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        // if (age  > 18){
        //     System.out.println("Adult");
        // }
        // else{
        //     System.out.println("Not Adult");
        // }
        // int x = sc.nextInt();
        // if (x % 2 == 0 ){
        //     System.out.println("Even");
        // }
        // else{
        //     System.out.println("Odd");
        // }

        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        if( a == b){
            System.out.println("Equal");
        }
        else if(a > b){
            System.out.println("A is greater");
        }
        else{
            System.out.println("B is greater");
        }
    }
}
