import java.util.*;


// Functions are set of code which perform something for you;
// Functions are used to modularise your code;
//  Functions are used to increases readiblity;

// ==================================================================================


// Types of Functions

//  void 
// return 
// parametrised 
// Non parametrised


 
//  Void Functions:

// Voide function is somethin which does not retun anyting



public class functions {
    //Function to print Hello world n times ;
    static void printHelloWorld(int n ){
        for (int i=0 ; i<n ;i++){
            System.out.println("Hello World");
        }

    }    
// Write a function to add two numbers and return the result.

    static void printsum(int a , int b){
        int  sum= a+b;
        System.out.println(sum);


    }


// Write a function to check whether a number is even or odd.
// static void even_odd( int num ){
//     if(num%2==0){
//         System.out.printf("%d IS even Number",num);
    
//     }else{
//         System.out.printf("%d Is a Odd Number",num);
        
//     }
// }


// // Write a function to find the square of a number.

// static void square_num( int num){
//    System.out.printf("Square of %d is %d%n", num, num * num);
// }


// // Write a function to find the maximum of two numbers.

// static int mximum(int[] arr) {
//  int    max=arr[0];

//    for(int i=1; i<arr.length;i++){
//     if(arr[i]>max){
//         max=arr[i];
//     }
//    }

//    return max;
    
 
// }


// Pass by value

static void dosomething(int num){
    System.out.println(num);
    num+=5;
    System.out.println(num);
    num+=5;
    System.out.println(num);

}

// Write a function to convert Celsius to Fahrenheit.

// Write a function to calculate the area of a circle.

// Write a function to print numbers from 1 to N.

// Write a function to return the absolute value of a number.

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        // int n= sc.nextInt();
        // int a= sc.nextInt();
        // int b= sc.nextInt();
        // printHelloWorld(n);
        // printsum(a ,b);


        // int arr[]={1,23,4,57,754,2,34,5};
        // int result = mximum(arr);
        // System.out.println(result);
        int num=5;
        dosomething(num);

        System.out.println(num);


        


        sc.close();

    }


}
