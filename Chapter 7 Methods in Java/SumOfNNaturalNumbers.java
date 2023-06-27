public class SumOfNNaturalNumbers {
    static int rec(int m){
     if(m==0 || m==1){
         return(1);
     }
     else{
         return(m+rec(m-1));
     }
    }
    public static void main(String[] args){
       int sum = rec(4);
       System.out.print(sum);
    }
}
