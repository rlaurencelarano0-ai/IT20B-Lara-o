



public class LinearSearch {

    // Linear Search Method

    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Found at index i
            }
        }
        return -1; // Not found
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        int result = search(arr, 4);

        if (result >= 0) {
            System.out.println("Found at index: " + result + " = " + arr[result]);
        } else {
            System.out.println("Element not found");
        }
    }
}