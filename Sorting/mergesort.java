
import java.util.ArrayList;

public class mergesort {
    static void merge( int[] arr ,int st , int mid ,int end ){
  ArrayList<Integer> temp = new ArrayList<>();
        int i=st, j= mid+1;

        while ( i <= mid && j <=end ){
            if (arr[i]<arr[j]){
                temp.add(arr[i]);
                i++;

            }else {
                temp.add(arr[j]);
                j++;
            }
        }

        while( i<= mid){
            temp.add(arr[i]);
            i++;

        }
        while ( j<=end ){
            temp.add( arr[j]);
            j++;
        }

        for (int idx=0;idx< temp.size();idx++){
            arr[idx+st]= temp.get(idx);


        }

    }
    static void sort( int[] arr, int st ,int end){
        
        if ( st < end){
        int mid= st+( end- st)/2;
        sort( arr ,st,mid);
        sort( arr, mid+1,end );
        merge( arr, st,mid,end);



       

        }
      

    }
    public static void main(String[] args){
        int arr[]={2,34,12,4,21,3,122,31,11,2,34,21,31,23,12,45,56,32,5,78,3,4};
        sort(arr, 0, arr.length - 1);

        for( int num: arr){
            System.out.print(num+ " ");
        }

    }
    
}
