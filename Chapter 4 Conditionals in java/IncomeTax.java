import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        System.out.println("Enter your yearly income in lakh");
        Scanner s = new Scanner(System.in);
        float income = s.nextFloat();

        if (income < 2.5f) {
            float tax = 0.0f;
            System.out.println("Your income tax amount is " + tax + " lakh rupees");
        } else if (income >= 2.5f && income <= 5.0f) {
            float tax = 0.05f * (income - 2.5f);
            System.out.println("Your income tax amount is " + tax + " lakh rupees");
        } else if (income >= 5.0 && income <= 10.0) {
            float tax = 0.05f * 2.5f + 0.2f * (income - 5.0f);
            System.out.println("Your income tax amount is " + tax + " lakh rupees");
        } else {
            float tax = 0.05f * 2.5f + 0.2f * 5.0f + 0.3f * (income - 10.0f);
            System.out.println("Your income tax amount is " + tax + " lakh rupees");
        }
    }

}
