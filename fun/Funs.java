import java.util.*;
public class Funs {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static int calProd(int a, int b){
        return a * b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println(calProd(a, b));
    }
}
