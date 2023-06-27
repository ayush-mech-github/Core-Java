import java.util.Scanner;
public class PrintNOddNaturalNumbers {
    public static void main(String[] args){
        System.out.println("enter the value of n");
        Scanner s = new Scanner(System.in);
        byte n = s.nextByte();
       for(int i=0;i<n;i++)
       {
            System.out.println(2*i+1);
       }
    }
    
}
