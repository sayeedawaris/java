import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7, 3};
        
        // Sorting in ascending order
        Arrays.sort(arr);
        System.out.println("Array sorted in ascending order:");
        printArray(arr);
        
        // Sorting in descending order
        reverseArray(arr);
        System.out.println("Array sorted in descending order:");
        printArray(arr);
    }
    
   
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
