import java.util.Scanner;
public class CelciusToFahrenheit {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter the temperature in celcius");
    float celcius = s.nextFloat();
    float fahrenheit = (9/5)*celcius+32;
    System.out.println("temperature in fahrenheit is ");
    System.out.println(fahrenheit);

    }

}
