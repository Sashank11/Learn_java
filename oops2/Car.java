public class Car extends Vec {

    int numDoors;

    public Car(){
        System.out.println("Car's constructor");
    }


    public void print(){
        super.print();
        System.out.println("Car " + " numDoors " + numDoors);
    }
    public boolean isMotorized(){
        return true;
    }
}
// Object class it the super class in java anything can be taken from it. llike say Object v = new Vec();