class Square_Details{
    int side;    
    public int area(){
        return(side*side);
    }
    public int perimeter(){
        return(4*side);
    }
}
public class Square {
    public static void main(String[] args){
       Square_Details s1 = new Square_Details();
       s1.side = 3;
       System.out.println(s1.area());
       System.out.println(s1.perimeter());
    }
    
}
