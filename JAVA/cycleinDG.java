import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class cycleinDG {


    static class Graph{
        int V;
        LinkedList<Integer> adj[];

        Graph(int v){
            V=v;
            adj = new LinkedList[v];

            for(int i=0;i<v;i++)
                adj[i] = new LinkedList<>();
        }

        void addEdge(int u, int v){
            adj[u].add(v);
        }

        boolean detect(int i,boolean[] visited, boolean[] recStack){

            if(recStack[i])
                return true;

            if(visited[i])
                return false;

            
            visited[i] = true;
            recStack[i] = true;

            List<Integer> child = adj[i];

            for(Integer j: child){
                if(detect(j,visited,recStack))
                    return true;
            }
            recStack[i] = false;

            return false;
            
        }


        boolean Cyclicgraph(){
            boolean[] visited = new boolean[V];
            boolean[] recStack = new boolean[V];
    
            for(int i=0;i<V;i++){
                if(detect(i,visited,recStack))
                    return true;
            
            }
            return false;
        }


       
    }


    

    public static void main(String[] args) {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        if(g.Cyclicgraph())
            System.out.println("Cyclic graph");
        else
            System.out.println("Not a cyclic graph");

    }
}
