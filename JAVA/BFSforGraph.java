import java.util.Iterator;
import java.util.LinkedList;

public class BFSforGraph {

    static class Graph{
        int V;
        LinkedList<Integer> adj[];
    
        
        Graph(int v){
            V = v;
            adj = new LinkedList[V];

            for(int i=0;i<v;i++){
                adj[i] = new LinkedList<>();
            }
        }

        void addEdge(int u,int v){
            adj[u].add(v);
        }


        void BFS(int s){

                boolean[] visited = new boolean[V];

                LinkedList<Integer> q = new LinkedList<>();
                q.add(s);

                while(q.size() != 0){
                    s = q.poll();
                    System.out.println(s);
                    visited[s] = true;

                    Iterator<Integer> i = adj[s].listIterator();
                    while(i.hasNext()){
                        int n = i.next();
                        if(!visited[n]){
                            visited[n] = true;
                            q.add(n);
                        }
                    }

                }


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

        g.BFS(3);
    }
}
