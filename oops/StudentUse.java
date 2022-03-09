import java.util.*;
public class StudentUse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int roll_no = sc.nextInt();
        Student s1 = new Student();
        System.out.println(s1);
        s1.name = name;
        s1.roll_no = roll_no;
        System.out.println(s1.name + " " + s1.roll_no);
        Student s2 = new Student();
        System.out.println(s2);
        s2.name = "abc";
        s2.roll_no = 22;

        sc.close();
    }
}
