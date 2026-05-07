
public class rightrotatektimes {

    static void rightrotate(int[] arr, int n, int k){
        // Step 1   store k  element in temp variable

      reverse(arr,0,n-1);
      reverse(arr,0,k-1);
      reverse(arr,k,n-1);

        
    




         

    }

    public static void reverse(int [] arr , int i , int j) {

        while( i<j){
            int temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;

        }



        
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int k=3;
        int n = arr.length;
        rightrotate(arr, n, k);


        for (int i =0 ;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
