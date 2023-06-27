public class Pattern2 {
    static void pattern(int m){
        for(int i = 0;i<m;i++){
            for(int j=0;j<(m-i);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
     pattern(4);
    }
    
}
