public class Duplicatesrec {
    public static String removeConsecutiveDuplicates(String s) {
		if(s.length() ==  1){
            return s;
        }
        String smallString = removeConsecutiveDuplicates(s.substring(1));
        if(s.charAt(0) == smallString.charAt(0)){
            return smallString;
        }
        else{
            return s.charAt(0) + smallString;
        }
	}
    public static void main(String[] args) {
        System.out.println(removeConsecutiveDuplicates("aaabbbccc"));
    }
}
