
import java.util.*;
public class Array {
    

    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
            
            System.out.println(arr[i]);
        }


        String names[]= new String[3];
        for(int i=0;i<3;i++){
            names[i]= sc.nextLine();
            System.out.println(names[i]);
        }



        









        sc.close();

    }
}
