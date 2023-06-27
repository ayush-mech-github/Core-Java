public class Recursion {
    static int fact(int m) {
        if (m == 0 || m == 1) {
            return (1);
        } else {
            return m * fact(m - 1);
        }

    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("factorial of " + n + " is " + fact(n));
    }
}
