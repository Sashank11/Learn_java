import java.util.*;
public class Arrays2d {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[ ] [ ] nums = new int[rows][cols];

    for(int i = 0; i < rows; i++){
        for(int j = 0; j< cols; j++){
            nums[i][j] = sc.nextInt();
        }
    }


    sc.close();

    }
}   
