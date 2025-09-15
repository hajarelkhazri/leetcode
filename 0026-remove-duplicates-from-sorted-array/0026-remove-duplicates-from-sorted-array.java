class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null){
            return 0;
        }
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length;j++){
                if(nums[i]!=nums[j]){
                    i++;
                    nums[i]=nums[j];    
                }
            }
            return i+1;
        }
        return 0;
    }
}