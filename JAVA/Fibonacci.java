// using for loop

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms you want in fibonacci series: ");
        int count = sc.nextInt();
        
        int a=0,b=1,c=1;
        System.out.print(a + " " + b + " " + c);
        for(int i=0; i< count-3; i++){
            a = b;
            b = c;
            c = a + b;
            System.out.print(" " + c);
        }
    }
}





// using recursion

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms you want in fibonacci series: ");
        int count = sc.nextInt();
        
        for(int i=0;i<count;i++){
            System.out.println(Fib(i));
        }
    }
    
    public static int Fib(int n){
        if(n==0 || n==1){
            return n;
        }
        
        return Fib(n-1) + Fib(n-2);
    }
}
