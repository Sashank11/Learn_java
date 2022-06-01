public class SumArray {
    public static int suma(int a[]){
        if (a.length == 0){
            return 0;
        }
        int smallArray[] = new int [a.length-1];
        for( int i = 1; i<a.length; i++){
            smallArray[i-1] = a[i];
        }
        int hyp = suma(smallArray);
        int sum = a[0] + hyp;

        return sum;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5}; 
        System.out.println(suma(a));
        }
}
