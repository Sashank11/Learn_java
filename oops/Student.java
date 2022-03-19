public class Student{

    public String name;
    int roll_no;
    public Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    public void print(){
        System.out.println(name + " " + roll_no);
    }
    public void setRollNumber(int roll_no){
        if(roll_no <= 0){
            return;
        }
        this.roll_no = roll_no;
    }   
}