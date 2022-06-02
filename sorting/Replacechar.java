public class Replacechar {
    public static String replaceChars(String input, char c1, char c2){
        if(input.length() == 0){
            return input;
        }
        String smallString = replaceChars(input.substring(1), c1, c2);
        if(input.charAt(0) == c1 ){
            return c2 + smallString;
        }
        else{
            return input.charAt(0) + smallString;
        }
    }
    public static void main(String[] args) {
        System.out.println(replaceChars("hahaha", 'a', 'e'));
    }
}
