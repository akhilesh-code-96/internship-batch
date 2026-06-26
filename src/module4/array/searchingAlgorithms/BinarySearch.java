package module4.array.searchingAlgorithms;

public class BinarySearch {

    public static void main(String[] args) {
        // It can only work on sorted array
        // find the mid
        // change the starting and ending index based the on the arr[mid] value

        int[] arr = {1, 4, 6, 9, 11, 17, 20};
        int target = 17;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                System.out.println("Target found at index -> " + mid);
                return;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    }
}
