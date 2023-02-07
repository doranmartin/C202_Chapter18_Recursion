import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("documents/integers.txt");
        Scanner input = new Scanner(file);
        int[] test = new int[] {7, 8, 9, 1, 2, 3, 4, 5, 6};

    }

    static int sum(int[] array, int n) {
        if (n <= 0)
            return 0;
        return array[n - 1] + sum(array, n - 1);
    }

    static void clear(int[] array, int n) {
        if (n > 0) {
            array[n - 1] = 0;
            clear(array, n - 1);
        }
    }

    static String makeLine(int n, char ch) {
        if (n <= 0)
            return "";
        return ch + makeLine(n - 1, ch);
    }

    static String makeStars(int n) {
        if (n <= 0)
            return "";
        return "*" + makeStars(n - 1);
    }

    static String reverse(String s) {
        if (s.length() <= 1)
            return s;
        return s.charAt(s.length() - 1)
                + reverse(s.substring(0, s.length() - 1));
    }

    static int max(int[] array, int size) {
        int max = array[0];
        int indexOfMax = 0;
        return max(array, size, max);
    }

    static int max(int[] array, int size, int max) {
        if (size == 0) {
            return max;
        }
        if (array[size - 1] > max) {
            max = array[size - 1];
        }
        return max(array, size - 1, max);
    }

    static int add(Scanner scanner) {
        if(!scanner.hasNext()) {
            return 0;
        }
        return scanner.nextInt() + add(scanner);
    }

    static void copy(Scanner scanner) {
        if (scanner.hasNext()) {
            System.out.println(scanner.next());
            copy(scanner);
        }
    }

    static int quotient(int m, int k) {
        if (k > m)
            return 0;
        return quotient(m, k, 1);
    }

    static int quotient(int m, int k, int n) {
        if (k > m)
            return 0;
        return n + quotient(m - k, k, n);
    }

    static int product(int m, int k) {
        if (k == 0) {
            return 0;
        }
        return m + product(m, k - 1);
    }

    static double harmonic(int n) {
        if (n == 1) {
            return 1;
        }
        return 1.0 / n + harmonic(n - 1);
    }

    static long oddEvenFact(int n) {
        if (n <= 2)
            return n;
        return n * oddEvenFact(n - 2);
    }

    static int sum(int n) {
        if (n <= 1)
            return 1;
        return n + sum(n - 1);
    }

    static long power(int x, int n) {
        if (n <= 0)
            return 1;
        return x * power(x, n - 1);
    }

}
