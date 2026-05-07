public class all_concept_learning {

    // 🟢 1. Basic Operations (Foundation)
    // Traversal (normal + reverse)

    
    // Second largest / smallest
    // Check sorted / rotated
   
     // Insert / delete (concept)
    static void traversal_and_reverse(int[] arr) {
        int n = arr.length;
        int k = 0;
        int j = n - 1;

        while (k < j) {
            int temp = arr[k];
            arr[k] = arr[j];
            arr[j] = temp;
            k++;
            j--;
        }
        // print array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

//     // Insert / delete (concept)

//    static void insert(int arr[], int n){
//     //shifting
//     for( int i= n;i>0;i--){
//         arr[i]= arr[i-1];

//     }
//     // insert at start
//     arr[0]=10000;

//     // insert at last

//     int[] newArr = new int[arr.length + 1];
//     for(int i =0;i<arr.length;i++){
//         newArr[i]=arr[i];
//     }
//     newArr[arr.length]=40;

//    }


// Max / Min
static void min_max(int[] arr){
    int lar=arr[0];
    int sec_lar=Integer.MIN_VALUE;
    int smallest= arr[0];
    int sec_smallest=Integer.MAX_VALUE;

    int n = arr.length;
    for( int i=1; i < n ; i++){
        if( arr[i]> lar){
            sec_lar=lar;
            lar= arr[i];
        }
        if( arr[i]<smallest){
            sec_smallest= smallest;
            smallest= arr[i];
        }
    }
    System.out.println("Largest = "+ lar);
    System.out.println("Second_Largest = "+ sec_lar);
    System.out.println("Smallest = "+ smallest);
    System.out.println("Second Smallest = "+ sec_smallest);
    
    }


     // Frequency count
    
   
    public static void main(String[] args) {
        int arr[] = { 12, 34, 12, 14, 5, 6, 755, 64, 5, 534, 98, 9 };
       

        traversal_and_reverse(arr);
        min_max(arr);
        // insert(arr, n);

    }

}
