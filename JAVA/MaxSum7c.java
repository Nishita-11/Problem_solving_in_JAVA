public class MaxSum7c{


    static int findmax(int[] arr, int n){
        if(n == 1){
            return arr[0];
        }

        int[][] dp = new int[n][2];
        //dp[i][0] --> excludes the value of arr[i] in the sum
        //dp[i][1] --> includes the value of arr[i] in the sum

        dp[0][0] = 0;
        dp[0][1] = arr[0];

        for(int i=1;i<n;i++){
            dp[i][1] = dp[i-1][0] + arr[i]; //previous sum is acheived using dp[i-1][0] as the previous index value must not be included in the sum,added to arr[i]
            dp[i][0] = Math.max( dp[i-1][0],dp[i-1][1]); //arr[i] is not included => arr[i-1] can or cannot be included as we need max, we choose max value from them
        }

        return Math.max(dp[n-1][0], dp[n-1][1]);

    }

    public static void main(String[] args){
        int[] arr = { 5, 5, 10, 100, 10, 5 };
        int N = arr.length;

        System.out.println(findmax(arr,N));
 
    }
}