public class Stringbuild {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        
        // sb.setCharAt(0, 'S');
        // System.out.println(sb);
        sb.insert(2, "n");
        System.out.println(sb);

        //delete extra n
        sb.delete(2, 4);
        System.out.println(sb);
        System.out.println();
        StringBuilder h = new StringBuilder("h");

        h.append("e"); // for normal string it would str = str + "e"
        h.append("l");
        h.append("l");
        h.append("o");
        System.out.println(h);
    }
}
