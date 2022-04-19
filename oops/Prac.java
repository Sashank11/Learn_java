import java.util.*;
import java.lang.*;
class Prac{
    public static void main(String[] args) {
        // x and y  string/number ->if string -> error || x/y if y is == 0 ->error ;
        Scanner sc = new Scanner(System.in);
        try{
            int x = sc.nextInt();
            int y = sc.nextInt();
            if( y == 0 ){
                throw new  RuntimeException(); // hera exception haru keke huncha yo part le test case fail bhayo
            }
        }
        catch(Exception e){
            System.out.println(e);
        }

        }
    }
