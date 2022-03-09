public class Stringbuild {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        
        // sb.setCharAt(0, 'S');
        // System.out.println(sb);
        sb.insert(0, "S");
        System.out.println(sb);

    }
}
