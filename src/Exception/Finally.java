package Exception;

import java.util.Scanner;

public class Finally {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next());

        try {

            int a = 5 / 0;

        } catch (Exception e) {

            System.out.println(e);

        } finally {

            System.out.println("This is in 'finally', it always gets run!");
        }
    }
}
