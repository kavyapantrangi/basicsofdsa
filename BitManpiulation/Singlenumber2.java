class Solution {
    public int[] twoOddNum(int Arr[], int N) {
        int[] result = new int[2];
        int xor = 0;

        
        for (int i = 0; i < N; i++) {
            xor ^= Arr[i];
        }

        
        long num = xor & ~(xor - 1);

        
        int b1 = 0, b2 = 0;
        for (int i = 0; i < N; i++) {
            if ((Arr[i] & num) != 0) {
                b1 ^= Arr[i];
            } else {
                b2 ^= Arr[i];
            }
        }

        
       if (b1 > b2) {
            result[0] = b1;
            result[1] = b2;
        } else {
            result[0] = b2;
            result[1] = b1;
        }

        return result;
    }
}
