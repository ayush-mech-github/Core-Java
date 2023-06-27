class Rectangle{
    private int length;
    private int breadth;

    public Rectangle(){
        this.length=4;
        this.breadth=5;
    }
    public Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public float getLength(){
         return(length);
    }
    public float getBreadth(){
         return(breadth);
    }
}
public class RectangleUsingConstructor {
    public static void main(String[] args){
       Rectangle r1 = new Rectangle();
       System.out.println(r1.getBreadth());
       System.out.println(r1.getLength());
    }
    
}
