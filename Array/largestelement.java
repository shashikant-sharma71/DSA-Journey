package Array;

public class largestelement {

    static void largest(int arr[], int n) {
     int lar=arr[0];
     for( int i=0;i< n;i++){
        if (arr[i]> lar){
            lar= arr[i];
        }
     }
     System.out.println(lar);

    }
    public static void main(String[] arg) {
        int arr[] = {2, 34, 5, 677, 78, 432, 4};
        int n = arr.length;

        largest(arr, n);
    }
}