import java.util.*;

public class pwrprogrammer1 {
    public static int findIndex(int arr[], int t) {

        // if array is Null
        if (arr == null) {
            return -1;
        }

        // find length of array
        int len = arr.length;
        int i = 0;

        // traverse in the array
        while (i < len) {

            // if the i-th element is t
            // then return the index
            if (arr[i] == t) {
                return i;
            } else {
                i = i + 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 5, 2, 8, 7, 3, 4, 9, 6, 10 };
        int arr1[] = new int[arr.length];
        arr1 = arr;
        Arrays.sort(arr1);
        int swap = 0;
        for (int i = 0; i < arr.length - 1; i = i + 2) {
            int element = arr[i];
            int index = findIndex(arr1, element);
            int element_pair = arr1[Math.abs(arr.length - 1 - index)];
            int index2 = findIndex(arr, element_pair);
            if (element_pair != arr[i + 1]) {
                int temp = arr[index2];
                arr[index2] = arr[i + 1];
                arr[i + 1] = temp;
                swap = swap + 1;
            }

        }
        System.out.println(swap);

    }
}
