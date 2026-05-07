package Array;

public class checkifarrayissorted {
    static boolean isSorted(int arr[], int n){
        for(int i=1; i<n; i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] arg){
        int arr[]= {2,34,5,677,78,432,4};
        int n = arr.length;

        System.out.println(isSorted(arr, n));
    
}
}