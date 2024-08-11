class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int j=0;
        int k=0;
        for(int i=0;i<commands.size();i++)
        {
            if(commands.get(i).equals("LEFT"))
            {
            k--;
            }
            if(commands.get(i).equals("RIGHT"))
            {
            k++;
            }
            if(commands.get(i).equals("DOWN"))
            {
            j++;
            }
            if(commands.get(i).equals("UP"))
            {
            j--;
            }
        }
        return (j*n)+k;
        
    }
}
