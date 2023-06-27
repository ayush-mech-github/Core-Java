class Circle{
    public int radius;
    float pi = 3.142f;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public float Area(){
           return(pi*radius*radius);
    }

}
class Cylinder extends Circle{
    public int height;

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public float surfaceArea(){
        return(2*pi*radius*height);
    }

    public float volume(){
        return(pi*radius*radius*height);
    }
}
public class circleAndCylinderInheritance {
    public static void main(String[] args){
      Circle c = new Circle();
      Cylinder cy = new Cylinder();
      c.setRadius(1);
      System.out.println(c.getRadius());
      System.out.println(c.Area());
      cy.setRadius(1);
      System.out.println(cy.getRadius());
      cy.setHeight(1);
      System.out.println(cy.getHeight());
      System.out.println(cy.surfaceArea());
      System.out.println(cy.volume());
    }
}
