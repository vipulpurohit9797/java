public class SortedArrayRecursion {
    public static void findSorted(int arr[], int idx) {
        if (idx == arr.length - 1) {
            System.out.println("array is sorted");
            return;
        }
        if (arr[idx] > arr[idx + 1]) {
            System.out.println("array is not sorted");
            return;
        }
        findSorted(arr, idx + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 6 };
        findSorted(arr, 0);
    }
}
