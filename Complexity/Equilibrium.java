public class Equilibrium {
    public static int arrayEquilibriumIndex(int[] arr){  
		int leftsum = 0;
        int totalsum = 0;
        int rightsum = 0;
        for(int a = 0; a < arr.length; a++){
            totalsum += arr[a];
        }
        for(int i = 0; i<arr.length;i++){
            rightsum = totalsum - leftsum -arr[i];
            
            if(leftsum == rightsum){
                return i;
            }
            leftsum = leftsum +arr[i];
        }
        
        
        return -1;
	}
}
