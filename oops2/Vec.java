public class Vec {

    private String color;
    int maxSpeed;

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public void print(){
        System.out.println("Vehicle " + " Color " + color + " speed " + maxSpeed); //private will not allow Vec access
    }
    
}
