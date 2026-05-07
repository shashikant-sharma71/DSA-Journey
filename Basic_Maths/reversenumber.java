public class reversenumber {

    static void reverse( int n){
        int reverseno= 0; 

        while(n>0){
            int lastdigit=n%10;
            reverseno=(reverseno*10)+lastdigit;
            n=n/10;



        }

    

        

        System.out.print(reverseno);
    }

    public static void main( String[] arg){
        int n= 1234;

        reverse(n);
    }
    
}
