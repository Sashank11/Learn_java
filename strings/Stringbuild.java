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
        System.out.println(h.length());

        for(int i = 0; i<h.length()/2; i++){
            int front = i;
            int back = h.length() - 1 - i;

            char frontChar = h.charAt(front);
            char backChar = h.charAt(back);
            
            h.setCharAt(front, backChar);
            h.setCharAt(back, frontChar);
        }
        System.out.println(h);
    }
}
