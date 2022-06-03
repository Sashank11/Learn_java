public class Geosum {
    public static double findGeometricSum(int k){
        if(k == 0){
            return 0;
        }
        if(k == 1){
            return 1;
        }
        return findGeometricSum(k-1) + 1/k;        
    }
}
