public class Student{

    public String name;
    final int roll_no;
    double cgpa;
    final static double CONVERSIONFACTOR = 0.95;
    private static int num_students;
    public Student(String name) {
        this.name = name;
        num_students++;
        this.roll_no = num_students++;
    }
    public static int get_num_student(){
        return num_students;
    }
    public void print(){
        System.out.println(name + " " + roll_no);
    }
    // public void setRollNumber(int roll_no){
    //     if(roll_no <= 0){
    //         return;
    //     }
    //     this.roll_no = roll_no;
    // }   
}