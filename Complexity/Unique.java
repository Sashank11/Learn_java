public class Unique {
    	public static int findUnique(int[] arr) {
		//Your code goes here
        int n=arr.length-2;
		int sum=0;
		for(int i : arr) {
			sum+=i;
		}
		return sum-(n*(n+1)/2); //The total sum -  sum of n numbers
	}
}
