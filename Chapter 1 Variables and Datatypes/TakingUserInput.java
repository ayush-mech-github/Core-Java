import java.util.Scanner;
public class TakingUserInput {
    public static void main(String[] args)
    {
        Scanner s =new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = s.nextInt();
        System.out.println("enter second number");
        int num2 = s.nextInt();        
        int sum = num1 + num2;
        System.out.println("the sum of two numbers is ");
        System.out.println(sum);
    }
    
}
