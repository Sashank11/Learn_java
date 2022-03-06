import java.util.*;
public class Ascend {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] num = new int[size];
        for(int i = 0; i<num.length; i++){
            num[i] = sc.nextInt();
        }
        boolean isAscend = true;
        for(int i = 0; i<num.length-1; i++){
            if(num[i]> num[i + 1]){
                System.out.println("Not Ascending");
                isAscend = false;
                break;
            }
        }
        if(isAscend){
            System.out.println("Ascending");
        }
        sc.close();
    }
}
