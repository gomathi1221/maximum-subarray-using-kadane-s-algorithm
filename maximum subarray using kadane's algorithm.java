class Solution {
    public int maxSubArray(int[] nums) {
        int curr=0;
        int max=-123455;
        for(int i=0;i<nums.length;i++){
            curr=curr+nums[i];
           max=Math.max(max,curr);
           if(curr<0){
            curr=0;
           }
        }
        return max;
    }
}