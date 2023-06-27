class Cylinder_Details_1 {
    private float radius;
    private float height;
    float pi = 3.14f;

    public float getHeight() {
        return (height);
    }

    public float getRadius() {
        return (radius);
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public void setHeight(float height) {
        this.height = height;

    }

    public float Surface_Area() {
        return (2 * pi * radius * height + 2 * pi * radius * radius);
    }

    public float Volume() {
        return (pi * radius * radius * height);
    }

}

public class Cylinder {
    public static void main(String[] args) {
        Cylinder_Details_1 c1 = new Cylinder_Details_1();
        // c1.height = 1;
        // c1.radius = 1;
        c1.setHeight(1);
        System.out.println(c1.getHeight());

        c1.setRadius(1);
        System.out.println(c1.getRadius());

        System.out.println(c1.Surface_Area());
        System.out.println(c1.Volume());
    }

}
