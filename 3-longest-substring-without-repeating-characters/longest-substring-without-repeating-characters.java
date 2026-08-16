class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int maxLen=0;
        int[] last=new int[128];
        java.util.Arrays.fill(last,-1);
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            if(last[ch]>=left){
                left=last[ch]+1;
            }
            last[ch]=right;
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
        
    }
}