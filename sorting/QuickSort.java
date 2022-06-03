public class QuickSort {

    public static int partition(int[] input, int si, int ei){
        int p = input[si];
        int smallerCount = 0;
        for(int i = si+ 1; i<=ei; i++){
            if(input[i] < p){
                smallerCount++;
            }
        }
        int temp = input[si+ smallerCount];
        input[si + smallerCount] =p;
        input[si] = temp;
        int i = si;
        int j = ei;
        while(i<j){
            if(input[i] < p){
                i++;
            }else if(input[j] >= p){
                j--;
            }else{
                int temp2 = input[i];
                input[i] = input[j];
                input[j] = temp2;
                i++; j--;
            }
        }
        return si + smallerCount;
}
    public static void quicksort(int[] input, int si, int ei){
        if(si>= ei){
            return;
        }
        int pIndex = partition(input, si, ei); 
        quicksort(input, si, pIndex - 1);
        quicksort(input, pIndex+1, ei);

    }
}
        // int i = 0;
        // int j = input.length;
        // while(i <j){
        //     do{
        //         i++;
        //     }while(input[i] < p);
        //     do{
        //         j--;

        //     }while(input[j] > p);
        //     if(i< j){
        //         int temp = input[i];
        //         input[i] = input[j];
        //         input[j] = temp;
        //     }
        // }
        // int temp = input[p];
        // input[p] = input[j];
        // input[j] = temp;
        // return j;