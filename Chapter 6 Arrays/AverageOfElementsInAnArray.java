public class AverageOfElementsInAnArray {
    public static void main(String[] args){
    int[] arr = {12,42,56,87,33};
    int sum = 0;
    for(int element : arr)
    {
        sum=sum+element;
    }
    float average = (float)sum/arr.length;
    System.out.println("Average of elements of array is " + average);
    }
}
