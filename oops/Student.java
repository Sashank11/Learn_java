public class Student{

    public String name;
    final int roll_no;
    double cpgpa;
    final double conversionFactor = 0.95;
    static int num_students;
    public Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
        num_students++;
    }
    // public Student(String name){
    //     this.name = name;
    // }
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