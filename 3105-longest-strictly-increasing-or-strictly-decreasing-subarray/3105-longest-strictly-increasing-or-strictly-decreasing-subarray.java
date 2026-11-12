class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxlen=0;
        for(int i=0;i<nums.length;i++){
            int currlen=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]>nums[j-1]){
                    currlen++;
                }else{
                    break;
                }
            }

            maxlen=Math.max(maxlen,currlen);
            
        }

         for(int i=0;i<nums.length;i++){
            int currlen=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[j-1]){
                    currlen++;
                }else{
                    break;
                }
            }

            maxlen=Math.max(maxlen,currlen);
            
        }

        return maxlen;
    }
}