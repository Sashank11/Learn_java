import java.util.*;
public class Funs {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        sc.close();
        printMyName(name);
    }
}
