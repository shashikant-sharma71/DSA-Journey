import java.util.Scanner;
public class Input_Output{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of X ");
        int x=sc.nextInt();
        System.out.println("The value of X is "+x);

        sc.close();
    }
}

