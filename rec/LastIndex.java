public class LastIndex {
    public static int lastIndex(int input[], int x){
        if(input.length == 0){
            return -1;
        }
        int smallArray[] = new int[input.length-1];
        for(int i = 1; i<input.length; i++){
            smallArray[i-1] = input[i];
        }
        int li = lastIndex(smallArray, x);
        if(li != -1){
            return li + 1;
        }
        else if(input[0] == x){
            return 0;
        
        }
        else{
            return -1;
        }
    }
}
