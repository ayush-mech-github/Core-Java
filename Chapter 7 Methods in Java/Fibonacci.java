public class Fibonacci {
    static int fib(int m){
        if(m==1){
            return(0);
        }
        else if(m==2){
            return(1);

        }
        else{
            return(fib(m-1)+fib(m-2));
        }

    }
    public static void main(String[] args){
        int term = fib(5);
        System.out.print(term);
    }
    
}
