import java.util.*;
public class Strings {
    public static void main(String[] args){

        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("Name: " + name);

        String a = "abc";
        String b = "fbc";
        // String c = a + b;
        // System.out.println(c.length());
        // for(int i = 0; i < c.length(); i++){
        //     System.out.println(c.charAt(i));
        // }
        if(a.compareTo(b) == 0){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }
}
