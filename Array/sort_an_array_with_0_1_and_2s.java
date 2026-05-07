

public class sort_an_array_with_0_1_and_2s {
    static void sort(int arr[]){
        int c1 =0 , c2 =0, c3=0;
        int n =arr.length;
        // O(n)
        for( int i = 0 ;i<n;i++){
            if (arr[i]==0){
                c1+=1;

            }
            else if(arr[i]== 1 ){
                c2+=1;

            }
            else{
                c3+= 1;
            }
        }

        //O(n)
int indx=0; 
        for( int i=0 ;i<c1 ;i++ ){
            arr[indx++]=0;
        }
        for( int i=0;i<c2;i++){
            arr[indx++]=1;

        }
        for( int i=0;i<c3;i++){
            arr[indx++]=2;
        }
        for (int num: arr){
             System.out.print(num + " ");
        }
       

    }

    public static void main(String[] args){
            int arr[]= {1,2,0,1,2,0,0,2,1};
            sort(arr);
    
    }
    
}
