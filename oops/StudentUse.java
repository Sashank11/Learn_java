import java.util.*;
public class StudentUse {
    public static void main(String[] args){
        Student s1 = new Student("Sashank", 11);
        System.out.println(s1);
        //s1.setRollNumber(100);
        System.out.println(s1.name + " " + s1.roll_no);
        Student s2 = new Student("Neo", 12);
        System.out.println(s2);
        //s2.setRollNumber(101);
        System.out.println(s2.name + " " + s2.roll_no);
    }
}
