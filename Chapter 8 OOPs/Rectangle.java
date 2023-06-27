class Rectangle_Details{
    int length;
    int breadth;

    public int area(){
        return(length*breadth);
    }

    public int perimeter(){
        return(2*(length+breadth));
    }
}
public class Rectangle {
    public static void main(String[] args){
     Rectangle_Details r1 = new Rectangle_Details();
     r1.length = 3;
     r1.breadth = 2;
     System.out.println(r1.area());
     System.out.println(r1.perimeter());
    }
}
