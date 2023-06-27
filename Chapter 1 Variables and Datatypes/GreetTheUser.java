import java.util.Scanner;

public class GreetTheUser {

    public static void main(String[] args) {
        System.out.println("enter your name");
        Scanner s = new Scanner(System.in);
        String name = s.next();
        System.out.println("hello " + name + " have a good day !");

    }

}
