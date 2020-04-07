package Test;

public class shellSort {
    public static void main(String[] args) {
        Comparable[] a = {15, 0, 6, 9, 3};
        sort(a);
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.println(a[i]);
                break;
            }
            System.out.print(a[i] + " ");
        }
    }
    public static void sort(Comparable[] a) {
        int N = a.length;                       // N = 5
        int h = 1;
        while (h < N / 3) {
            h = 3 * h + 1;                      // 1, 4, 13, 40, ...
        }
        while (h >= 1) {                        // 1 >= 1
            for (int i = h; i < N; i++) {       // i = 1; 2
                for (int j = i;  j >= h && compareElement(a[j],  a[j - h]); j -= h) {   // j = 1, 1 >= 1 && (a[1], a[0]); j = 0; j = 2, a[2], a[1]
                    // 把小的数排前面
                    swap(a, j, j - h);
                }
            }
            h = h / 3;
        }
    }
    // return true if v is less than w
    public static boolean compareElement(Comparable v, Comparable w) {
        // see if v is less than w
        return v.compareTo(w) < 0;
    }

    public static void swap(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
