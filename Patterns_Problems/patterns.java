

//Patterns means nasted loops 

public class patterns {

//  Write a program for this patterns
// *****
// *****
// *****
// *****
// *****
static void print1(int n){

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");

            }
        System.out.println();
    
        }
    }

//  Write a program for this patterns
// *****
// ****
// ***
// **
// *
static void print2(int n ){
    for(int i=0;i<n;i++){                       //*****
        for(int j=n-1;j>=i;j--){               // ****
               System.out.print("*");       // ***
        }                                     // **
        System.out.println();                //  *
    }
}

//  Write a program for this patterns
// *
// **
// ***
// ****
// *****
static void print3(int n){
    for(int i=0 ;i<n;i++){
        for(int j=0;j<=i;j++){
            System.out.print("*");      
        }
        System.out.println();    
    }
}

//  Write a program for this patterns
// 1
// 12
// 123
// 1234
static void print4(int n){

    for(int i=1;i<n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
    
        }
        System.out.println();

    }
}

//  Write a program for this patterns
// 1
// 22
// 333
// 4444
static void print5(int n){
    for(int i=1;i<n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(i);

        }
        System.out.println();
    }
}

//  Write a program for this patterns
// *****
// ****
// ***
// **
// *
static void print6(int n){
    for (int i=1;i<n;i++){
        for(int j=n-1;j>=i;j--){
            System.out.print("*");
        }
        System.out.println();

    }
}

//  Write a program for this patterns
// 1234
// 123
// 12
// 1
static void print7(int n){
    for(int i=1;i<n;i++){
        for (int j=1;j<n-i+1;j++){
            System.out.print(j);
        }
        System.out.println();  
    }

}

//  Write a program for this patterns
//         *        
//        ***       
//       *****      
//      *******     
//     *********    
//    ***********   
//   *************  
//  *************** 
// *****************
static void print8(int n) {
    for (int i = 0; i < n; i++) {

        // spaces
        for (int j = 0; j < n - i - 1; j++) {
            System.out.print(" ");
        }
        // stars
        for (int j = 0; j < 2 * i + 1; j++) {
            System.out.print("*");
        }
        // spaces (optional, symmetry ke liye)
        for (int j = 0; j < n - i - 1; j++) {
            System.out.print(" ");
        }

        System.out.println();
    }
}

//  Write a program for this patterns
// *****************
//  *************** 
//   *************  
//    ***********   
//     *********    
//      *******     
//       *****      
//        ***       
//         * 
static void print9(int n) {
    for (int i = 0; i < n; i++) {

        // spaces
        for (int j = 0; j < i  ; j++) {
            System.out.print(" ");
        }
        // stars
        for (int j = 0; j < 2*n-(2 * i + 1); j++) {
            System.out.print("*");
        }
        // spaces (optional, symmetry ke liye)
        for (int j = 0; j < i; j++) {
            System.out.print(" ");
        }

        System.out.println();
    }
}

 //  Write a program for this patterns
//         *        
//        ***       
//       *****      
//      *******     
//     *********    
//    ***********   
//   *************  
//  *************** 
// *****************
// *****************
//  *************** 
//   *************  
//    ***********   
//     *********    
//      *******     
//       *****      
//        ***       
//         *   

static void print10(int n){


    for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1; j++){
            System.out.print(" ");
          
        }
          for (int j=0;j<2*i+1;j++){
            System.out.print("*");
    
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            System.out.println( );
        }

          for(int i=0;i<n;i++){


            for(int j=0;j<i;j++){
                System.out.print(" ");

            }
            for(int j=0 ; j< 2*n-(2*i+1);j++){
                System.out.print("*");

            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            System.out.println( );

    }
        



        

}

 //  Write a program for this patterns
// *
// **
// ***
// ****
// *****
// ******
// *******
// ********
// *********
// ********
// *******
// ******
// *****
// ****
// ***
// **
// *
static void print11(int n){
    for(int i=1;i<=2*n-1;i++){
        int stars=(i<=n) ? i: (2*n-i);
        for (int j=1;j<=stars;j++){
            System.out.print("*");
        }
        System.out.println( );

    }
  
}


 public static void main(String[] args){ 

    int n=9;
    // print1(n);
    // print2(n);
    // print3(n);
    // print4(n);
    // print5(n);
    // print6(n);
    // print7(n);
    //  print8(n);
    //  print9(n);
    //  print10(n);
     print11(n);


    // Print 2





 }
}
    
