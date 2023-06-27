class PrintGoodMorning extends Thread {
    public void run() {
        while (true) {
            System.out.println("Good Morning!");
        }
    }
}

class PrintWelcome extends Thread {
    public void run() {
        while (true) {
            try {
                Thread.sleep(200);//prints welcome with delay of 200ms.
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Welcome!");
        }
    }
}

public class GoodMorningWelcome {
    public static void main(String[] args) {
        PrintGoodMorning p1 = new PrintGoodMorning();
        PrintWelcome p2 = new PrintWelcome();
        p1.run();
        p2.run();

    }
}