package Test;

/*  Convert char[] to String:
    String.valueOf(chars);
    new String(chars)
 */

public class charArraytoString {
    public static void main(String[] args) {
        char[] chars = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
        String str1 = String.valueOf(chars);
        System.out.println(str1.length());
        System.out.println(str1);

        String str2 = new String(chars);
        System.out.println(str2.length());
        System.out.println(str2);
    }
}
