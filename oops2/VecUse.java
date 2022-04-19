public class VecUse {
    public static void main(String[] args){
        Vec v = new Vec();
        v.color = "Red";
        v.print();

        Car c = new Car();
        c.color = "Black";
        c.numDoors = 4;
        //c.print();
        c.Carprint();

        Bicycle b = new Bicycle();
        b.print();
    }
}
