class Exec extends RuntimeException {
    
    Exec(String msg){
        super (msg);
    }
}

public class Mi{
public static void main(String[] args){
    int age = 99;
    if(age <18){
        throw new Exec("Not eligible to vote");
    }
    else{
        System.out.println("eligible");
    }
}
}