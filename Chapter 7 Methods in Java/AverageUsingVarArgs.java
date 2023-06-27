public class AverageUsingVarArgs {
    static float avg(int ... arr){
        int sum = 0;
        for(int element : arr){
            sum = sum + element;
        }
        return(sum/(float)arr.length);     
        
    }
    public static void main(String[] args){
        float average = avg(4,6,8);
        System.out.print(average);
    }
    
}
