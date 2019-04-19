/**
 *
 * @author burhanuddinkhomosi
 */
public class Solve {
    
    int max;
    int index;
    int findMaxDestination(int dist[], int V)
    {
        max=-1;
        index=-1;
        for(int i = 0; i < V; i++)
            if(max<dist[i])
            {
                max=dist[i];
                index = i;
            }
        return max;
    }
}
