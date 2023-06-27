class SphereDetails {
    float radius;

    public float getRadius() {
        return (radius);
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float SurfaceArea(){
        return(4*(float)Math.PI*radius*radius);
    }

    public float Volume(){
        return((4/3)*(float)Math.PI*radius*radius*radius);
    }
}

public class Sphere {
    public static void main(String[] args) {
        SphereDetails s1 = new SphereDetails();
        s1.setRadius(2);
        System.out.println(s1.getRadius());
        System.out.println(s1.SurfaceArea());
        System.out.println(s1.Volume());
    }
}
