package Lambda;

public class TypeInference {

    public static void main(String[] args) {
        StrLenLambda myLambda = s -> s.length();

        System.out.println(myLambda.getLen("Hello Lambda"));

        printLambda(s -> s.length());
    }

    public static void printLambda(StrLenLambda l) {
        System.out.println(l.getLen("Hello Lambda"));
    }

    interface StrLenLambda {
        int getLen(String s);
    }
}
