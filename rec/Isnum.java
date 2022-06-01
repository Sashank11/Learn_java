public class Isnum {
    public static boolean checkNumber(int input[], int x){
        if(input[0] == x){
            return true;
        }
        if(input.length ==1 && input[0] !=x){
            return false;
        }
        int smallArray[] = new int[input.length-1];
        for(int i = 1; i<input.length; i++){
            smallArray[i-1] = input[i];
        }
        boolean hyp = checkNumber(smallArray, x);
        return hyp;
    }
    
}
