public class Student{

    public String name;
    int roll_no;


    public void setRollNumber(int roll_no){
        if(roll_no <= 0){
            return;
        }
        this.roll_no = roll_no;
    }   
}