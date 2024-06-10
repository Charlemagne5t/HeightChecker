class Solution {
    public int heightChecker(int[] heights) {
        int[] freq = new int[101];
        int n = heights.length;
        for (int i = 0; i < n; i++) {
            freq[heights[i]]++;
        }

        int res = 0;
        int j = 0;
        for (int i = 1; i < 101; i++) {
            while(freq[i] != 0) {
                if(heights[j++] != i){
                    res++;
                }
                freq[i]--;
            }
        }
        return res;
    }
}