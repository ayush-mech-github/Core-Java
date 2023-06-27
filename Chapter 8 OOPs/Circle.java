class Circle_Details{
    int radius;
    float pi = 3.14f;
    public float area(){
        return(pi*radius*radius);
    }
    public float perimeter(){
        return(2*pi*radius);
    }
}
public class Circle {
    public static void main(String[] args){
     Circle_Details c1 = new Circle_Details();
     c1.radius=1;
     System.out.println(c1.area());
     System.out.println(c1.perimeter());
    }
    
}
