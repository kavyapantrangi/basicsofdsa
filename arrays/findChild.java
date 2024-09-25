class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count = 0;
        Arrays.sort(g); Arrays.sort(s);
        int child = g.length, cookie = s.length;
        for(int G = 0, C = 0; G < child && C < cookie;){
            if(g[G] <= s[C]){
                count ++;
                G++;
                C++;
            }
            while(G < child && C < cookie && g[G] > s[C]){
                C++;
            }
        }
        return count;
    }
}
