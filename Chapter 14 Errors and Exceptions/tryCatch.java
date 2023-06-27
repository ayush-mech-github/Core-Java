import java.util.Scanner;

public class tryCatch {
    public static void main(String[] args) {
        int[] arr = { 12, 45, 56, 65 };
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array index");
        int k = sc.nextInt();
        try {
            System.out.println(arr[k]);
        } catch (Exception e) {

            System.out.println("invalid index!");
            System.out.println(e);

        }
        System.out.println("program ends");

    }
}
