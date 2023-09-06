import java.util.Scanner;

public class greatestnextnumb {

    static class stack{
        int top;
        int[] s = new int[100];

         void push(int n){
            top++;
            if(top == 100){
                System.out.println("Overflow");
            }
            else{
                s[top] = n;
            }
        }

        int pop(){
            
            if(top == -1){
                System.out.println("Underflow");
                return 0;
            }
            else{
                int p = s[top] ;
                top--;
                return p;
            }
        }

        int peek(){
            if(top >=0 ){
                return s[top];
            }
            else{
                return 0;
            }
        }

        boolean isEmpty(){
            boolean res = (top == -1)? true : false;
            return res;
        }
    }
    public static void main(String[] args) {

        stack a = new stack();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        for(int i=0;i<n;i++){
            input[i] = sc.nextInt();
        }

        int curr;

        // for(int i=1;i<n;i++){
        //     curr=input[i-1];
        //     if(input[i]>curr){
        //         if(a.isEmpty()){
        //             System.out.println(curr + " has NGE as "+input[i]);
        //             a.push(input[i]);
        //         }
        //         else if(!a.isEmpty()){
        //             System.out.println(curr + " has NGE as "+input[i]);
        //             int stacktop=a.peek();
        //             while(stacktop < input[i] && a.top>=0){
        //                 System.out.println(stacktop + " has NGE as "+input[i]);
        //                 a.pop();
        //                 stacktop = a.peek();
        //             }
        //             a.push(input[i]);
        //         }
        //         else{
        //             a.push(input[i]);
        //         }
        //     }
        //     else if(input[i]<curr){
        //         a.push(curr);
        //     }
        // }
        int stop;

        a.push(input[0]);
        for(int i=1;i<n;i++){
            stop = a.pop();
            if(!a.isEmpty()){
                while(stop < input[i]){
                    System.out.println(stop + " has NGE as "+input[i]);

                    if(a.isEmpty()){
                        break;
                    }
                    else{
                        stop=a.pop();
                    }
                }

                if(input[i] > stop){
                    a.push(stop);
                }
            }
            a.push(input[i]);
        }

        while(!a.isEmpty()){
            System.out.println(a.peek() + " has NGE as -1");
            a.pop();
        }

        sc.close();
        
    }
}
