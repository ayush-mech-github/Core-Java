import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        System.out.println("Enter the website");
        Scanner s = new Scanner(System.in);
        String website = s.next();
        if (website.endsWith(".com")) {
            System.out.println("This is a commercial website");
        } else if (website.endsWith(".org")) {
            System.out.println("This is an organizational website");
        } else if (website.endsWith(".in")) {
            System.out.println("This is an Indian website");
        }
    }

}
