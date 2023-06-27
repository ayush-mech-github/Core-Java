public class IsSortedOrNot {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 9, 5, 6, 8 };
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
            }
        }
        if (isSorted) {
            System.out.println("array is sorted");
        } else {
            System.out.println("array is not sorted");

        }
    }
}
