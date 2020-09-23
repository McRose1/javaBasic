package Regex;

/*
    分割多个空格符
 */

public class SplitSpaces {

    public static void main(String[] args) {
        String s = "a   bb      ccc     dddd";
        // 多个空格
        String[] str1 = s.split("\\s+");
        System.out.println(str1.length);
        // 单个空格
        String[] str2 = s.split("\\s");
        System.out.println(str2.length);
        for (int i = 0; i < str2.length; i++) {
            System.out.println(str2[i]);
        }
        String[] str3 = s.split(" ");
        System.out.println(str3.length);

        StringBuilder sb = new StringBuilder();
        for (String s1 : str1) {
            sb.append(s1);
        }

        // 事实证明 for ( : ) 这种循环遍历会自动跳过空格
        StringBuilder sb2 = new StringBuilder();
        for (String s2 : str2) {
            sb2.append(s2);
        }


        StringBuilder sb3 = new StringBuilder();
        for (String s3 : str3) {
            sb3.append(s3);
        }

        // 应输出 "abcd"
        System.out.println(sb.toString());

        System.out.println(sb2.toString());

        System.out.println(sb3.toString());
    }
}
