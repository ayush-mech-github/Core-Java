import java.util.Scanner;
public class NaturalNumbersInReverseOrder {
    public static void main(String[] args){
        System.out.println("Enter the value of n");
        Scanner s = new Scanner(System.in);
        byte n = s.nextByte();
        for(int i=n;i!=0;i--)
        {
            System.out.println(i);
        }

    }
}
