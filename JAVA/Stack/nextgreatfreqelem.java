import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

// import greatestnextnumb.stack;




// HashMap() --> Constructor --> Constructs an empty HashMap with the default initial capacity (16) and the default load factor (0.75).
// get​(Object key)	Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
// put​(K key, V value) Associates the specified value with the specified key in this map
// remove​(Object key) Removes the mapping for the specified key from this map if present.
// size() Returns the number of key-value mappings in this map.
// values()	Returns a Collection view of the values contained in this map.
// containsKey​(Object key) Returns true if this map contains a mapping for the specified key.



public class nextgreatfreqelem {

    Stack<Pairs> mystack = new Stack<>();
    HashMap<Integer,Integer> mymap = new HashMap<>();

    class Pairs{
        int data;
        int freq;

        Pairs(int data, int freq){
            this.freq = freq;
            this.data = data;
        }
    }

    void NGFE(int input[], int res[]){

        //store frequencies in map
        for(int i=0;i<input.length;i++){
            if(!mymap.containsKey(input[i])){
                mymap.put(input[i], 1);
            }
            else{
                mymap.put(input[i], mymap.get(input[i])+1);
            }
        }

        int cf = mymap.get(input[input.length - 1]);

        mystack.push(new Pairs(input[input.length - 1], cf));
        res[input.length - 1] = -1;

        for(int i = input.length - 2; i>=0; i--){
            //System.out.println("round"+ i +":" +input[i]);
            cf= mymap.get(input[i]) ;


            // 
            while(!mystack.isEmpty() && cf >= mystack.peek().freq){
                mystack.pop();
            }

           if(mystack.isEmpty()){
                res[i] = -1;
           }
           else{
                res[i] = mystack.peek().data;
           }

            mystack.push(new Pairs(input[i], mymap.get(input[i])));
        }
        
        
        for(int i=0;i<input.length;i++){
            System.out.print(res[i]+" ");
        }
        
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        int[] res = new int[n];

        for(int i=0;i<n;i++){
            input[i] = sc.nextInt();
            res[i] = 0;
        }

       nextgreatfreqelem f = new nextgreatfreqelem();
       f.NGFE(input, res);
        



        sc.close();
    }
}
