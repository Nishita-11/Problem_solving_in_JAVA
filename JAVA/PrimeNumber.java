
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to test whether it is a prime number or not: ");
        int n = sc.nextInt();
        
        if(n==0 || n==1){
            System.out.println("Neither prime nor composite");
            return;
        }
        if(n==2){
             System.out.println(n + " is prime number");
             return;
        }
        else{
            for(int i=2;i<n/2;i++){
                if(n%i == 0){
                     System.out.println(n + " is not prime number");
                     return;
                }
            }
        }
        
        System.out.println(n + " is prime number");
    }
}
