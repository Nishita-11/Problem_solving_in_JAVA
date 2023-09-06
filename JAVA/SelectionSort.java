public class SelectionSort{
    //The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) 
    //from the unsorted part and putting it at the beginning. 
    
    
    
    public static void main(String[] args){
        int[] arr = {64, 25, 12, 22, 11};
        int n = arr.length;
       
       int j,min_index;
       for(int i=0;i<n-1;i++){
            j=i+1;
            min_index = i;
            while(j<n){
                
                if(arr[min_index]>arr[j]){
                    min_index = j;
                }
                j++;
            }

            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
       }

        for(int i=0;i<n;i++){
        System.out.println(arr[i]+" ");
    }
    }

   
}