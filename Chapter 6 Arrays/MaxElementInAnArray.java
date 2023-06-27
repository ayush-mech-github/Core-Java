public class MaxElementInAnArray {
    public static void main(String[] args){
      int[] arr = {129,45,67,89,99};
      int max = 0;
      for(int element : arr)
      {
          if(element>max)
          {
              max = element;
          }        
      }
      System.out.println("maximum element is " + max);
    }
    
}
