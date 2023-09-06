import java.util.*;
class Job{
    int start;
    int finish;
    int profit;

    Job(int start,int finish,int profit){
        this.start = start;
        this.finish = finish;
        this.profit = profit;
    }
}

//Time Complexity of the Solution is O(n^2)

public class WeightedJobScheduling{

    
static int latestNonConflict(Job[] arr,int i){
    for(int j=i-1;j>=0;j--){
        if(arr[j].finish <= arr[i].start){
            return j;
        }
    }

    return -1;
}

static int findMaxProfitDp(Job[] arr, int n){
    int[] table = new int[n];
    table[0] = arr[0].profit;

    for(int i=1;i<n;i++){
        int includeprofit = arr[i].profit;
        int l = latestNonConflict(arr,i);

        if(l != -1){
            includeprofit = includeprofit + table[l];
            table[i] = Math.max(includeprofit, table[i-1]);
        }
    }

    return table[n-1];
}

static int findMaxProfit(Job[] arr, int n){

    for(int i=0;i<n;i++)
    {
        Arrays.sort(arr, new Comparator<Job>() {
           public int compare(Job j1, Job j2){
                return j1.finish - j2.finish;
           }
        });
    }

    return findMaxProfitDp(arr,n);
}

    public static void main(String args[]){
        int m = 4;
        Job arr[] = new Job[m];
        arr[0] = new Job(3, 10, 20);
        arr[1] = new Job(1, 2, 50);
        arr[2] = new Job(6, 19, 100);
        arr[3] = new Job(2, 100, 200);
        int n = arr.length;
        System.out.println("The optimal profit is "
                           + findMaxProfit(arr, n));
    }
}