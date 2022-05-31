public class Rec1 {

    public static int fac(int n){
        if (n==0){
            return 1;
        }
        int smallOut = fac(n-1);
        int output = n * smallOut;
        return output;
    }
    public static void main(String[] args) {
        System.out.println(fac(5));
    }
}
