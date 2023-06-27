import java.util.Scanner;

public class MultiplicationTableInReverseOrder {
    public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    byte n = s.nextByte();
    for (int i = 10;i>=1;i--)
    {
        System.out.println(n + "*" + i + "=" + n * i);
    }
}
}
