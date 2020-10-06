package Test;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (input.charAt(0) == 'q') {
            // show quit message
            System.out.println("Your are quitting");
        } else if (Integer.parseInt(input) <= 0) {
            // show error message
            System.out.println("Error");
        } else if (Integer.parseInt(input) > 0) {
            int x = Integer.parseInt(input);
            for (int i = 0; i < x; i++) {
                doSomething(x);
            }
        }
    }

    private static void doSomething(int x) throws FileNotFoundException, UnsupportedEncodingException {
        Random rand = new Random();
        int n = rand.nextInt(4);
        if (n == 0) {
            sum(x);
        } else if (n == 1) {
            timestamp(x);
        } else if (n == 2) {
            file(x);
        } else {
            oddEven(x);
        }
    }

    private static void sum(int x) {
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    private static void timestamp(int x) {
        Date date = new Date();
        long time = date.getTime();
        Timestamp ts = new Timestamp(time);
        System.out.println(ts);
    }

    private static void file(int x) throws FileNotFoundException, UnsupportedEncodingException {
        System.out.println("Creating file");
        PrintWriter writer = new PrintWriter("x.txt", "UTF-8");
        writer.println("Hello World!");
        writer.close();
    }

    private static void oddEven(int x) {
        if (x % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
