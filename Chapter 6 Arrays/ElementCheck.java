public class ElementCheck {
    public static void main(String[] args) {
        byte flag = -1;
        int[] arr = { 42, 74, 67, 19, 90 };
        for (int element : arr) {
            flag += 1;
            if (element == 19) {
                System.out.println("element found at index " + flag);
            }
        }
    }
}
