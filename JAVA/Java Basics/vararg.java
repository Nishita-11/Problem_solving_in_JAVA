public class vararg {

    static int sum(int ...arr){
        // we get the arguments as array
        int res =0 ;
        for(int i=0;i<arr.length;i++){
            res = res+arr[i];
        }

        return res;
    }

    static int sumofn(int n, int sum){
        if(n == 0){
            return sum;
        }

        else{
            sum = sum+n;
            return sumofn(n-1, sum);
        }
    }
    public static void main(String[] args) {
        System.out.println("Sum of nothing is : " + sum());
        System.out.println("Sum of 2 ,3 is : " + sum(2,3));
        System.out.println("Sum of 2 ,3 ,4 is : " + sum(2,3,4));
        System.out.println("Sum of 2 ,3 ,4 ,5 is : " + sum(2,3,4,5));

        System.out.println("Sum of first "+ 3 + " is "+sumofn(3,0));
    }
}
