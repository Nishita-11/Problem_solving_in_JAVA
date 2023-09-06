import java.util.Scanner;
import java.util.Stack;

public class maxprodofindexofgreatleftnright {

    static class pair{
        int index;
        int data;

        pair(int index, int data){
            this.data=data;
            this.index=index;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] input = new int[n];
        int[] right = new int[n];
        int[] left = new int[n];

        for(int i=0;i<n;i++){
            input[i] = sc.nextInt();
            right[i] = 0;
            left[i] = 0;
        }

        Stack<pair> Rstack = new Stack<>();
        Stack<pair> Lstack = new Stack<>();
        

        int Rcur = input[0];
        int Lcur = input[n-1];
        Rstack.push(new pair(0, Rcur));
        Lstack.push(new pair(n-1, Lcur));


        for(int i=1;i<n;i++){
            Rcur = input[i];
            Lcur = input[n-i-1];

            // Right NGE
            if(Rstack.peek().data>=Rcur){
                Rstack.push(new pair(i, Rcur));
            }
            else{
                while(!Rstack.isEmpty() && Rstack.peek().data < Rcur){
                    //System.out.println(Rstack.peek().data+ " has right NGE as "+Rcur);
                    right[Rstack.peek().index] = i+1;
                    Rstack.pop();
                }
                Rstack.push(new pair(i, Rcur));
            }

            // Left NGE
            if(Lstack.peek().data>=Lcur){
                Lstack.push(new pair(n-i-1, Lcur));
            }
            else{
                while(!Lstack.isEmpty() && Lstack.peek().data < Lcur){
                   // System.out.println(Lstack.peek().data+ " has left NGE as "+Lcur);
                    left[Lstack.peek().index] = n-i;
                    Lstack.pop();
                }
                Lstack.push(new pair(n-i-1, Lcur));
            }
        }

        while(!Rstack.isEmpty()){
            //System.out.println(Rstack.peek().data+ " has NGE as -1");
            right[Rstack.peek().index] = 0;
            Rstack.pop();
        }

        while(!Lstack.isEmpty()){
            //System.out.println(Lstack.peek().data+ " has NGE as -1");
            left[Lstack.peek().index] = 0;
            Lstack.pop();
        }

        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max<right[i]*left[i]){
                max = right[i]*left[i];
            }

        }
        System.out.println("Max index product of left and right next greatest element is: "+max);

        sc.close();

    }
}
