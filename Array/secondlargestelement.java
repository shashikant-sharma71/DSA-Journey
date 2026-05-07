public class secondlargestelement {

    static void secondLargest(int arr[], int n) {
        int lar = arr[0];
        int secondlar = Integer.MIN_VALUE;

        for (int i = 1; i < n; i++) {

            if (arr[i] > lar) {
                secondlar = lar;
                lar = arr[i];

            } else if (arr[i] < lar && arr[i] > secondlar) {
                secondlar = arr[i];
            }
        }

        if (secondlar == Integer.MIN_VALUE) {
            System.out.println("No second largest element");
        } else {
            System.out.println(secondlar);
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 34, 5, 677, 78, 432, 4};
        int n = arr.length;

        secondLargest(arr, n);
    }
}