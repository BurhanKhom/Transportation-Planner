class ShortestPath
{
    
    MinimumDistance m = new MinimumDistance();
    int dijkstra(int graph[][], int src, int V, int dist[])
    {
        Boolean finalized[] = new Boolean[V];
        for (int i = 0; i < V; i++)
        {
            dist[i] = Integer.MAX_VALUE;
            finalized[i] = false;
        }
        dist[src] = 0;
        for (int i = 0; i < V-1; i++)
        {
            int u = m.minDistanceIndex(dist, finalized, V);
            
            finalized[u] = true;
            for (int v = 0; v < V; v++)
                if (!finalized[v] && graph[u][v]!=0 && dist[u] != Integer.MAX_VALUE && dist[u]+graph[u][v] < dist[v]) 
                    dist[v] = dist[u] + graph[u][v];
        }
        System.out.print("From "+src+": ");
        for(int i=0; i<V; i++)
            System.out.print(dist[i]+" ");
        System.out.println();
        Solve s = new Solve();
        return s.findMaxDestination(dist, V);
    }
}