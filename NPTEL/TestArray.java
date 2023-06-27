public class TestArray {
    public static void main(String[] args) {
        int arr[] = { 12, 45, 67, 89, 43 };// initialization + memory allocation + declaration
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // average calculation
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            
        }
        System.out.println("average of array elements is " + (float)sum / arr.length);

    }
}
