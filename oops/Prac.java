class Test{
    static int marks;
    void set_marks(int marks)
    {
        this.marks=marks;               //Line 1 gives warning not error
    }
}
class Prac {
    public static void main (String[] args) {
        Test t=new Test();              
        t.set_marks(78);                //Line 2
        System.out.print(Test.marks);   //Line 3
    }
}