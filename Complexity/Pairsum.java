import java.util.*;
public class Pairsum {
public static int pairSum(int[] arr,int sum) {
	HashMap<Integer,Integer> m = new HashMap<>();
    int count = 0;
    for(int i = 0; i < arr.length; i++){
        if (m.containsKey(sum - arr[i])) {
            count += m.get(sum - arr[i]);
        }
        if(m.containsKey(arr[i])){
            m.put(arr[i], m.get(arr[i])+1);
        }
        else{
            m.put(arr[i], 1);
        }
    }
    return count;	
	}
}
