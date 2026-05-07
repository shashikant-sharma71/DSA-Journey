

public class sub_array {
// Bruitforce Aroach
static void max_sub_sum(int arr[]) {
    //     int n = arr.length;
    //     int max_sum = Integer.MIN_VALUE;

    //     for (int st = 0; st < n; st++) {
    //         int current_sum = 0;

    //         for (int end = st; end < n; end++) {
    //             current_sum += arr[end];  // FIXED
    //             max_sum = max(current_sum, max_sum);
    //         }
    //     }

    //     System.out.println("Max Subarray Sum: " + max_sum);
    // }


    // Kadane's algorithms
     int n = arr.length;

     int currentsum=0 ;

    int max_sum = Integer.MIN_VALUE;

    for( int i =0;i < n; i++){
        currentsum=Math.max( arr[i],currentsum+arr[i]) ;
        max_sum=Math.max( currentsum,max_sum);


    }
    System.out.println(max_sum);

}


    

    
    





    public static void main(String[] args) {
        int arr[] = {1, -2, 3, -4, 5};
        max_sub_sum(arr);
    }
}