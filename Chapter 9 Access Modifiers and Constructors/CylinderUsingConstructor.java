class Cylinder_Details {
    private float radius;
    private float height;
    float pi = 3.14f;

    public Cylinder_Details(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    public float getRadius(){
         return(radius);
    }
    public float getHeight(){
         return(height);
    }

    public float Surface_Area(){
          return(2*pi*radius*height);
    }

    public float Volume(){
          return(pi*radius*radius*height);
    }
}

public class CylinderUsingConstructor {
    public static void main(String[] args) {
        Cylinder_Details c1 = new Cylinder_Details(1, 1);

        System.out.println(c1.getRadius());
        System.out.println(c1.getHeight());
        System.out.println(c1.Surface_Area());
        System.out.println(c1.Volume());
    }
}
