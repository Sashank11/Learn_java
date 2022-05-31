public class Power {

    public static int getPower(int x, int n){
        if(n ==0  || x == 0){
            return 1;
        }
        if(n == 1){
            return x;
        }
        if(x == 1){
            return 1;
        }
        int hyp = getPower(x, n-1);
        int out = x * hyp;
        return out;
    }
    public static void main(String[] args) {
        System.err.println(getPower(5,5));
    }
}