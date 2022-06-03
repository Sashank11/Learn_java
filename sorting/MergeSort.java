public class MergeSort {

    public static void merge(int[] s1, int[] s2, int[] d){
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < s1.length && j < s2.length){
            if(s1[i] <=s2[j]){
                d[k] = s1[i];
                i++;
                k++;
            }
            else{
                d[k] = s2[j];
                k++;
                j++;
            }
        }
        if(i < s1.length){
            while(i < s1.length){
                d[k] = s1[i];
                i++;
                k++;
            }
        }
        if(j < s2.length){
            while(j < s2.length){
                d[k] = s2[j];
                j++;
                k++;
            }
        }
    }
    public static void mergeSort(int input[]){
        if(input.length == 0){
            return;
        }
        if(input.length == 1){
            return;
        }
        int mid = input.length/2;
        int smallArray1[] = new int[mid];
        int smallArray2[] = new int[input.length-smallArray1.length];
        for(int i = 0; i<mid; i++){
            smallArray1[i] = input[i];
        }
        for(int i = mid; i<input.length; i++){
            smallArray2[i-input.length/2] = input[i];
        }
        mergeSort(smallArray1);
        mergeSort(smallArray2);
        merge(smallArray1, smallArray2, input);
    }

    public static void main(String[] args) {
        int[] a = {12, 24,13,5, 6};
        mergeSort(a);
        for(int i = 0; i<a.length; i++) {
        System.out.print(a[i] + " ");
    }

    }
}