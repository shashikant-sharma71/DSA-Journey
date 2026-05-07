public class moveallzeroatlast{

    static void zeros(int[] arr) {

        // BrutForce

        int n = arr.length;

        // // step 1: non-zero elements temp me store karo
        // int[] temp = new int[n];
        // int j = 0;

        // for (int i = 0; i < n; i++) {
        //     if (arr[i] != 0) {
        //         temp[j] = arr[i];
        //         j++;
        //     }
        // }

        // // step 2: temp ke elements wapas arr me daalo
        // for (int i = 0; i < j; i++) {
        //     arr[i] = temp[i];
        // }

        // // step 3: baaki positions me 0 bhar do
        // for (int i = j; i < n; i++) {
        //     arr[i] = 0;
        // }


// Optimal Solutin
int j=0;


for (int i=0;i<n;i++){
    if(arr[i]!=0){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        j++ ;
        
    }
}



    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 4, 0, 5};

        zeros(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}