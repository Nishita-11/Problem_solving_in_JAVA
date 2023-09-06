public class BubbleSort{

    //works by repeatedly swapping the adjacent elements if they are in the wrong order. 
    //This algorithm is not suitable for large data sets as its average and worst-case time complexity is quite high.

    //Time Complexity: O(N2)
    //Auxiliary Space: O(1) 

    //Total number of swaps = Total number of comparison
    //Total number of comparison (Worst case) = n(n-1)/2
    //Total number of swaps (Worst case) = n(n-1)/2

    //Worst and Average Case Time Complexity: O(N2). The worst case occurs when an array is reverse sorted.
    //Best Case Time Complexity: O(N). The best case occurs when an array is already sorted.

    //  At pass 1 :  Number of comparisons = (n-1)
                    // Number of swaps = (n-1)

    //At pass 2 :  Number of comparisons = (n-2)
                    // Number of swaps = (n-2)
                    
    public static void main(String[] args){
        int[] arr = {10,6,8,1,3,7,2};
        int n = arr.length;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println("round "+ (i+1));
            for(int k=0;k<n;k++)
                System.out.print(arr[k]+ " ");
        }
    }
}