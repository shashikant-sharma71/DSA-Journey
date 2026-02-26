package Sorting;

public class bubblesort {

    static void bubble(int arr[], int n) {

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;

        bubble(arr, n);

        System.out.println("Sorted array:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


// Time Complexity  O(n^2)