abstract class Pen {
    public abstract void write();

    public abstract void refill();
}

class Natraj extends Pen {
    public void write() {
        System.out.println("writing...");
    }

    public void refill() {
        System.out.println("refilling...");
    }
}

public class AbstractClassPen {
    public static void main(String[] args) {
        Natraj p = new Natraj();
        p.write();
        p.refill();
    }

}