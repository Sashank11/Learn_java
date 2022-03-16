import java.util.*;
public class StudentUse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Student s1 = new Student();
        System.out.println(s1);
        s1.name = name;
        s1.setRollNumber(100);
        System.out.println(s1.name + " " + s1.roll_no);
        Student s2 = new Student();
        System.out.println(s2);
        s2.name = "abc";
        s2.setRollNumber(101);
        System.out.println(s2.name + " " + s2.roll_no);
        sc.close();
    }
}
