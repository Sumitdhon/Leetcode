package leetcode;

public class Dutchalgorithmusingswap {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2, 1, 2, 0, 0};
        sortColors(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sortColors(int[] arr) {
        int n = arr.length;
        int mid = 0;
        int high = n - 1;
        int low = 0;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, mid, low);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else { // arr[mid] == 2
                swap(arr, mid, high);
                high--;
            }
        }
    }
}

    

