public class Ispalin {
    	public static boolean isStringPalindrome(String input, int start) {
		// Write your code here
        if(start == input.length() /2){
            return true;
        }
        if(input.charAt(start) != input.charAt(input.length()-1-start)){
            return false;
        }
        return isStringPalindrome(input, start+ 1);
		
	}
    public static boolean isStringPalindrome(String input){
        return isStringPalindrome(input, 0);
    }
    public static void main(String[] args) {
        String str = "sas";
        System.out.println(isStringPalindrome(str));
    }
}
