import java.util.Iterator;
import java.util.LinkedList;

class Graph{
    int V;
    LinkedList<Integer> adj[];

    Graph(int v){
        V=v;
        adj = new LinkedList[v];

        for(int i=0;i<v;i++){
            adj[i] = new LinkedList();
        }
    }

    void addEdge(int u, int v){
        adj[u].add(v);
        adj[v].add(u);
    }

    boolean detect(int i, boolean visited[], int p){
        visited[i] = true;
        int k;

        Iterator<Integer> iter = adj[i].iterator();
        while(iter.hasNext()){
            k = iter.next();

            if(!visited[k]){
                if(detect(k, visited, i))
                    return true;
            }
            else if(k != p)
               return true;

            
                
        }
        return false;  
    }


    boolean isCycle(){

        boolean visited[] = new boolean[V];

        for(int i=0;i<V;i++)
            visited[i] = false;

        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(detect(i, visited, -1)){
                    return true;
                }
            }
        }

        return false;
    }
}


public class cycleinUDG {
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(1, 0);
        g.addEdge(0, 2);
        g.addEdge(2, 1);
        g.addEdge(0, 3);
        g.addEdge(3, 4);

        if(g.isCycle())
            System.out.println("Cyclic graph");
        else
            System.out.println("Not a cyclic graph");
    }
}
