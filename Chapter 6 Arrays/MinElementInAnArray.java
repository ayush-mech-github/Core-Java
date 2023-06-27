public class MinElementInAnArray {
    public static void main(String[] args){
        byte[] arr = {12,35,77,9};
        byte min = Byte.MAX_VALUE;
        for(byte element : arr){
            if(element<min){
                min = element;
            }
        }
        System.out.println("min element is " + min);
    }
    
}
