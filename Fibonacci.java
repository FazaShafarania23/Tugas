public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Change n to modify the number of terms printed
        int a = 1, b = 1, c;
        System.out.print(a + " " + b);
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
