import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int fact = 1;

        //using for loop
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is " + fact);
        
        //using while loop
        int i = 1;
        while(i<=n)
        {
            fact = fact *i;
            i++;
        }
        System.out.println("Factorial of " + n + " is " + fact);
    }

}
