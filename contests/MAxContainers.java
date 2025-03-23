class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
    int N=n*n;
    int count=0;
        int i=0;
        int total=0;
    while(i<N)
        {
            total+=w;
            if(total<=maxWeight)
            count++;
            i++;
        }

        return count;
    }
}
