import java.util.Scanner;

public class SumOfThreeNumbers {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter three numbers");
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int n3 = s.nextInt();
        int sum = n1+n2+n3;
        System.out.println("sum of entered numbers is");
        System.out.println(sum);

    }
}