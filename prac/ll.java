import java.util.*;
import java.lang.*;
class Student{
    int roll;
    String name;
}
public Student(int roll, String name){
    this.roll = roll;
    this.name = name;
}
public String getDetails(){
    return (roll + " " + name);
}

public class ll{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        int n = sc.nextInt();
        sc.nextLine();
        HashMap<Integer,Student> h = new HashMap<>();
        ArrayList<Integer> arr  = new ArrayList<>();
        for(int i =0; i<n; i++){
            int roll = sc.nextInt();
            sc.nextLine();
            String nm = sc.nextLine();
            arr.add(roll);
            h.put(roll, new Student(roll,nm));
        }
        Collections.sort(arr);
        for(int j:arr){
            System.out.println(h.get(j).getDetails());
        }
    }
}