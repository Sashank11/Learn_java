import java.io.*;
import java.util.*;
public class Expectionz {
    public static void main(String[] args){
        int i = 1;
        int j = 0;
        int k = 3;
        try {
            FileOutputStream fos = new FileOutputStream("abc.txt");
            i = j/k;
        }
        catch(ArithmeticException e){
                e.printStackTrace();
        }
        catch(IOException ie){
            
        }
        catch(Exception e){

        }
    }
}
