public class StringBuiler {
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder("Timpany");
        System.out.println(sb);
        System.out.println(sb.charAt(0));

        sb.setCharAt(0, 'P');
        System.out.println(sb);
        sb.insert(2,'r');
        System.out.println(sb);
    }
}
