package Array;

public class largestelement {

    static void largest(int arr[], int n){
         

       int lar=arr[0];
       int seclar=-1;
    

       for(int i=1; i<n;i++){

        if (arr[i]>lar){
            seclar=lar;
            lar=arr[i];
        }
        else{
            if( arr[i]<lar && arr[i]>seclar){
                seclar=arr[i];
            }
        }


       }
       System.out.println(lar);
       System.out.println(seclar);

    }

    public static void main(String[] arg){
        int arr[]= {2,34,5,677,78,432,4};
        int n = arr.length;

        largest(arr, n);



    }
    
}
