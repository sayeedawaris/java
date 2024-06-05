public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99, 2, 50};
        int max = arr[0]; 
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; 
            }
        }
        
        System.out.println("The largest element in the array is: " + max);
    }
}
