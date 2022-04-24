public class Car extends Vec {

    int numDoors;

    public Car(){
        System.out.println("Car's constructor");
    }


    public void print(){
        super.print();
        System.out.println("Car " + " numDoors " + numDoors);
    }

}
