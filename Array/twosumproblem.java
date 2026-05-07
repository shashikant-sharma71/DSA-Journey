

public class twosumproblem {

    static void tosum(int[] arr , int target){
        int i=0;
        int j=arr.length-1;
    
        while(i<j){
            if (arr[i]+arr[j]==target){
                System.out.print("First Element is found at inddex " + i +"Seond Element is found at index " +j);

            }
            else if (arr[i]+arr[j]<target){
                i++;
                j--;
            }

        }

    }

    public static void main(String[] args){
         int arr[]={23,34,5,34,54,23,43,20};
         int target = 43; 
         tosum(arr, target);
    }
    
}
