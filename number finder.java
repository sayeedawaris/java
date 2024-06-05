public class NumberFinder {
    public static void main(String[] args) {
        int[] arr = {5, 12, 7, 3, 9, 15, 6};
        int target = 9;
        
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = true;
                System.out.println("The number " + target + " is found at index " + i);
                break;
            }
        }
        
        if (!found) {
            System.out.println("The number " + target + " is not found in the array.");
        }
    }
}
