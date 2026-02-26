package Array;

public class secondlargestrlement {

    static void secondLargest(int arr[], int n){
        int lar=arr[0];
        int secondlar=-1;


        for (int i=1; i<n;i++){
            if(arr[i]>lar){
                secondlar=lar;
                lar= arr[ i];
            
            }else { 
                
                
                if(arr[i]<lar && arr[i]>secondlar){
            secondlar= arr[i];

            }
                
        }
        }
        System.out.println(secondlar);
        

    }


    public static void main( String[] args){
        int arr[]= {2,34,5,677,78,432,4};
        int n = arr.length;

        secondLargest(arr, n);

    }
    
}
