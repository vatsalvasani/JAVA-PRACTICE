import java.util.*;
class Edge{
    int src;
    int dest;
    Edge(int s,int d)
    {
        src = s;
        dest = d;
    }
}
class Graph{
    ArrayList<Edge>[] graph;
    Graph(int V)
    {
        graph = new ArrayList[V];
    }
    void createGraph()
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));
        graph[1].add(new Edge(1,4));
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,3));
        graph[2].add(new Edge(2,1));
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));
    }
    void printNeighbours()
    {
        for(int i=0;i<graph.length;i++)
        {
            for(int j=0;j<graph[i].size();j++)
            {
                System.out.print("Neighbours Of " + (i) + "is" + graph[i].get(j).dest);
                System.out.println();
            }
        }
    }
    void bfs(int start,boolean[] visited,Queue<Integer> q)
    {
        visited[start] = true;
        System.out.println(start);
        for(int i=0;i<graph[start].size();i++)
        {
            q.add(graph[start].get(i).dest);
        }
        while(!q.isEmpty())
        {
            int k = q.peek();
            if(visited[k]==false)
            {
                System.out.println(k);
                for(int i=0;i<graph[k].size();i++)
                {
                    q.add(graph[k].get(i).dest);
                }
            }
            visited[k] = true;
            q.remove();
        }
        for(int i=0;i<visited.length;i++)
        {
            if(visited[i]==false)
            {
                bfs(i,visited,q);
            }
        }

    }
    void dfs(int start,boolean[] visited)
    {
        System.out.println(start);
        visited[start] = true;
        for(int i=0;i<graph[start].size();i++)
        {
            if(visited[graph[start].get(i).dest] == false)
            {
                dfs(graph[start].get(i).dest,visited);
            }
        }
    }
    void findAllPath(int s,int d,boolean[] visited,String path)
    {
        if(s==d)
        {
            System.out.println(path);
            return;
        }
        for(int i=0;i<graph[s].size();i++)
        {
            if(visited[graph[s].get(i).dest] == false)
            {
                visited[graph[s].get(i).dest] = true;
                findAllPath(graph[s].get(i).dest ,d,visited,path+Integer.toString(graph[s].get(i).dest));
                visited[graph[s].get(i).dest] = false;
            }
        }
    }
}

public class ArrayOfArrayList{


    public static void main(String args[])
    {
        int V = 6;
        Graph g = new Graph(V);
        g.createGraph();
        g.printNeighbours();
        Queue<Integer> q = new ArrayDeque<>();
        boolean[] visited = new boolean[V];
        for(int i=0;i<visited.length;i++)
        {
            visited[i] = false;
        }
        g.bfs(5,visited,q);
        for(int i=0;i<visited.length;i++)
        {
            visited[i] = false;
        }
        g.dfs(5,visited);
        for(int i=0;i<visited.length;i++)
        {
            if(visited[i]==false)
            {
                g.dfs(i,visited);
            }
        }
        for(int i=0;i<visited.length;i++)
        {
            visited[i] = false;
        }

        g.findAllPath(0,4,visited,"0");

        
    }
    

}