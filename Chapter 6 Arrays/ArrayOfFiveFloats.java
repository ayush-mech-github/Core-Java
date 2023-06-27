public class ArrayOfFiveFloats {
    public static void main(String[] args) {
        float[] arr = { 23.5f, 21.5f, 11.5f };
        float sum = 0.0f;
        for (int i = 0; i < arr.length; i++) {
          sum = sum + arr[i]; 
        }
        System.out.println(sum);
    }

}
