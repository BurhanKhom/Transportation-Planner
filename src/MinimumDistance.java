
/**
 *
 * @author burhanuddinkhomosi
 */
public class MinimumDistance {
    
    int minDistanceIndex(int dist[], Boolean finalized[], int V)
    {
        int min = Integer.MAX_VALUE, min_index=-1;
 
        for(int i = 0; i < V; i++)
            if(finalized[i] == false && dist[i] <= min)
            {
                min = dist[i];
                min_index = i;
            }
        return min_index;
    }
    
}
