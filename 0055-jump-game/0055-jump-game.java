class Solution {    

    public boolean canJump(int[] nums) {
        int max_index = 0;
         for(int current_index = 0; current_index<nums.length; current_index++){
            if(current_index>max_index){
                return false;
            }
            if(nums[current_index]+current_index>max_index){
                max_index = nums[current_index]+current_index;

            }
            if(max_index>=nums.length-1){
                return true;
            }
        }
        return false;
    }
//     5,3,2,1,0,1,1,1
    // 3 2 2 0 4
}