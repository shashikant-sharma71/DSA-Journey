package Sorting;
public class selectionsort {

    static void selection(int arr[] , int n){
       for( int i =0; i < n-1;i++){
        for( int j=i+1;j<n;j++){
            int small= i;
            if( arr[j]<arr[small]){
                small= j;

            }
            int temp= arr[small];
            arr[small]= arr[i];
            arr[i]=temp; 


        }
        // Print array
       
       }
    }

    public static void main( String[] args){
        int arr[]={ 23,4,45,6,34,2,45,6,7,85,34,23,45,222,23,445,654,345} ;
        int n= arr.length;


        selection(arr, n);

        System.out.println("Sorted Array");
        for(int i=0;i< n;i++){
        System.out.println(arr[i] + " ");
        }

       
    }
    
}


// Time Complexity  O(n^2)