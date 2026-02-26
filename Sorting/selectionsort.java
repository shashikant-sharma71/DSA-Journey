package Sorting;
public class selectionsort {

    static void selection(int arr[] , int n){
        for( int i=0;i<n;i++){
         int   smallestindex=i;
            for(int j=i+1;j<n;j++){
                if( arr[j]<arr[smallestindex]){
                    smallestindex=j;
                }
            }
            int temp= arr[i];
            arr[i]=arr[smallestindex];
            arr[smallestindex]=temp;
            
        }
         for( int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main( String[] args){
        int arr[]={ 23,4,45,6,34,2,45,6,7,85,34,23,45,222,23,445,654,345} ;
        int n= arr.length;

        System.out.println("Sorted Array");
        selection(arr, n);

       
    }
    
}


// Time Complexity  O(n^2)