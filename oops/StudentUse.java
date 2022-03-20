import java.util.*;
public class StudentUse {
    public static void main(String[] args){
        Student s1 = new Student("Sashank");
        System.out.println(s1);
        //s1.setRollNumber(100);
        // s1.print();
        Student s2 = new Student("Neo");
        // s2.print();
        //s2.setRollNumber(101);
        
        Student s3 = new Student("Samyo");
        // System.out.println(s2.num_students);
        System.out.println(Student.num_students);

    }
}
