import java.util.*;

public class Arrays{
    public static void main(String[] args){
        // int[] marks = new int[3];
        // marks[0] = 97;
        // marks[1] = 98;
        // marks[2] = 95;
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int[size];
        for(int i = 0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        for(int i = 0; i<size; i ++){
            System.out.println(numbers[i]);
        }
        sc.close();
    }
}