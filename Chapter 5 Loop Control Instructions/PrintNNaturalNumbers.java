import java.util.Scanner;
public class PrintNNaturalNumbers {
    public static void main(String[] args){
        System.out.println("enter the value of n");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i<=n);
    }
    
}
