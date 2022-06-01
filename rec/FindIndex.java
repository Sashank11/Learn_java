public class FindIndex {

    public static int findIndex(int a[], int x, int si){
        if(a[si]==x){
            return si;
        }
        if(si == a.length -1){
            return -1;
        }
        int indexFound = findIndex(a,x, si+1);
        return indexFound;
    } 
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9};
        int x = 9;
        int si = 0;
        System.out.println("test");
        System.out.println(findIndex(a,x, si));
    } 
}

// public class Solution {
// 	static int count = 0;
// 	public static int firstIndex(int input[], int x) {
// 		if(input[0]!=x){
//         count = count + 1;
//         }
//         else{
//             return count;
//         }
//         if(input[0] == input.length -1){
//             return -1;
//         }
//         int smallArray[] = new int[input.length-1];
//         for(int i = 1; i<input.length; i++){
//             smallArray[i-1] = input[i];
//         }
//         int indexFound = firstIndex(smallArray,x);
//         return indexFound;
// 	}
	
// }