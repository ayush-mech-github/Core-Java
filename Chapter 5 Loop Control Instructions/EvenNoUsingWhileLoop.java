import java.util.Scanner;

public class EvenNoUsingWhileLoop {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        byte n = s.nextByte();
        int sum = 0;
        int i=0;
        while(i<=n)
        {
            if(i%2==0){
            sum = sum + i;
        }
        i++;
        }
        System.out.print(sum);
    }
}
