public class countdigit{
     static void digit(int n){
    n=Math.abs( n);
    if( n==0){
     System.out.println("1");
    }else{

int count=0;
     while( n>0){

     

 n= n/10;
 count+=1;
     }
     System.out.println(count);

    }

     }
     public static void main( String[] args){
          int n= -123;
          digit(n);
       
     }
}