import java.util.*;
public class Funs {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static int calProd(int a, int b){
        return a * b;
    }
    public static int calFac(int a){
        if (a <0){
            System.out.println("Factorial for negative doesnot exist");
            return 0;
        }
        else if(a == 0){
            return 1;
        }
        else{
            int fac = 1;
            for(int i = a; i>=1; i--){
                fac = fac * i;
            }
        return fac;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        System.out.println(calFac(a));
    }
}
