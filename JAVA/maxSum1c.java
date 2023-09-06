import java.util.Scanner;

public class maxSum1c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i=0;i<n;i++)
            num[i] = sc.nextInt();

        int[] dp = new int[n];
        dp[0] = num[0];
        int max = num[0];

        for(int i=1;i<n;i++){
            dp[i] = num[i] + (dp[i-1] > 0 ? dp[i-1]:0);
            max = Math.max(max, dp[i]);
        }
        System.out.println("Maximum value: "+max);
    }
}
