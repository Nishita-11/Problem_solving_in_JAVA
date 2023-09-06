import java.util.*;

public class ConnectingRopesMinCost{

    //Time Complexity: O(N*log(N))

    static int minCost(int[] arr,int n){

        //The PriorityQueue is based on the priority heap. 
        //The elements of the priority queue are ordered according to the natural ordering, 
        //or by a Comparator provided at queue construction time, depending on which constructor is used.  

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }

        int res=0,k=0;
        while(pq.size() > 1){
            int first = pq.poll();
            int second = pq.poll();

           
            res = res + first + second;
            //System.out.println("k= "+ k +" res: "+ res);
            pq.add(first + second);
            //k++;
        }
        return res;
    }

    public static void main(String args[]){
        int len[] = { 4, 3, 2, 6 };
        int size = len.length;
        System.out.println("Total cost for connecting"
                           + " ropes is "
                           + minCost(len, size));
    }
}