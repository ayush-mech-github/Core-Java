class Rectangle {
    public int length;
    public int breadth;
    // constructor
    Rectangle(int l,int b) {
    this.length=l;
    this.breadth=b;
    }
    public int getLength() {
        return length;
    }
    public int getBreadth() {
        return breadth;
    }
}

class Cuboid extends Rectangle {
    public int height;
    // constructor
    Cuboid(int l, int b, int h) {
        super(l,b);//invoke constructor of parent class
        this.height = h;
    }
    public int getHeight() {
        return height;
    }
}

public class rectangleAndCuboidInheritance {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(1,1);
        System.out.println(r.length);
        System.out.println(r.breadth);
        Cuboid c = new Cuboid(1,1,1);
        System.out.println(c.length);
        System.out.println(c.height);
        System.out.println(c.breadth);
    }
}
