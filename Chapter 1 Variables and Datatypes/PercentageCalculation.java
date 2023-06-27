import java.util.Scanner;
public class PercentageCalculation {

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter marks of five subjects out of 100");
        int num1=s.nextInt();
        int num2=s.nextInt();
        int num3=s.nextInt();
        int num4=s.nextInt();
        int num5=s.nextInt();

        float sum=num1+num2+num3+num4+num5;
        float per;
        per=((sum/500)*100);
        System.out.println("the percentage of marks is");
        System.out.println(per);

    }
    
}
