public class MultiplicationTable {

    static void mul(int m) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(m + "*" + i + "=" + m * i);
        }
    }

    public static void main(String[] args) {
        int n = 8;
        mul(n);

    }
}