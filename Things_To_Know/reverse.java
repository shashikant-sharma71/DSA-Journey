

public class reverse {
    public static int reverseNumber(int n){
        int original=n;

        int rev=0;
        while(n!=0){
             int digit= n%10;
             if (rev>(Integer.MAX_VALUE/10)|| rev<Integer.MIN_VALUE/10){
                return 0;
             }
              rev = (rev*10 )+digit;
              n=n/10;
            
        }
        if (rev==original){
            return 1;

        }else {
            return 0;
        }
      
       
        


    }
   
   
   public static int ArmstrongNumber(int n){
    int original=n;
    int sum= 0;
    while (n!=0){
        int digit=n%10;
        sum = sum+(digit*digit*digit);
        n=n/10;

    }
    if (sum==original){
        return 1;
    }else {
        return 0;
   }}


   public static int Divisor(int n){
    for (int i=1;i<=n;i++){
        if (n%i==0){
            System.out.println(i);
    }
    
    }return 0;
   }   
    public static void main(String[] args) {
        int n=36;
        // System.out.println(reverseNumber(n));
        System.out.println(ArmstrongNumber(n));
        Divisor(n);
    
}}