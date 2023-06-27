import java.util.Scanner;
public class PassOrFail {
    public static void main(String[] args){
    System.out.println("enter marks of three subjects");
    Scanner s = new Scanner(System.in);
    int marks1 = s.nextInt();
    int marks2 = s.nextInt();
    int marks3 = s.nextInt();
    float per = ((marks1+marks2+marks3)/300.0f)*100.0f;
     
    if(marks1>33 && marks2>33 && marks3>33 && per>=40.0f)
    {
        System.out.println("Congratulations! You passed the examination");
    }
    else{
        System.out.println("sorry! you failed the examination");
    }
    }
}
