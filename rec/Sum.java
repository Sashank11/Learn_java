public class Sum {

    public static int sum(int n){
        if (n == 0){
            return 0;
        }
        int hyp = sum(n-1);
        int  out = n + hyp;
        return out;
    }
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
