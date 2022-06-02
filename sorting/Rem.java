public class Rem {
    public static String remX(String input){
        if(input.length() == 0){
            return input;
        }

        String smallString = remX(input.substring(1));
        if(input.charAt(0) == 'x'){
            return smallString;
        }
        else{
            return input.charAt(0) + smallString;
        }
    }
    
}
