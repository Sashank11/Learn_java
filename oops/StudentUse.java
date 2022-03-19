import java.util.*;
public class StudentUse {
    public static void main(String[] args){
        Student s1 = new Student("Sashank", 11);
        System.out.println(s1);
        //s1.setRollNumber(100);
        s1.print();
        Student s2 = new Student("Neo", 12);
        s2.print();
        //s2.setRollNumber(101);

    }
}
