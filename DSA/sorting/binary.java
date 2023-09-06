import java.util.Scanner;


class BinarySort{
    int sortedelement(int a[], int l, int r,int s){
        int mid = (l+r)/2;
        if(a[mid]==s){
            return mid;
        }

        if(a[mid] > s){
            return sortedelement(a,l,mid-1,s);
        }
        else return sortedelement(a, mid+1, r, s);

    }

    
}


public class binary{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n ;
        System.out.println("Enter Number of elements");
        n=s.nextInt();
        int [] a = new int[10];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
        }

        int k= 10;

        BinarySort b = new BinarySort();
        System.out.println(b.sortedelement(a,0,n,k));

        s.close();

    }
}