class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        int k = 0;
        int val = nums[0];
        for (int i = 0; i < nums.length; i++){
            if(val == nums[i]){
                if(count<2){
                    nums[k]=nums[i];
                    k++;
                    count++; 
                }  
        }
            else{
                val=nums[i];
                nums[k]=nums[i];
                k++;
                count=1;
            }
        }
        return k;
    }
}