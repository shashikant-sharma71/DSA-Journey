public class palindromnumber {
    static void palindrom(int n){
        if ( n<0){
            return;
            
        }
        int originl=n;
        int reverse=0;

        while (n!=0){
           int  digit= n%10 ;

           if ( reverse > Integer.MAX_VALUE/10){
            return false;
           }

           reverse=(reverse*10)+digit;
           n=n/10;



        }
                                 


    }
    
}
