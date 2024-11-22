class Solution {
    public int[] findErrorNums(int[] nums) {
        int a_pointer = 0;
        int b_pointer =1;

        while(a_pointer < nums.length && b_pointer < nums.length){
            if(nums[a_pointer] == nums[b_pointer]){
                return new int[]{nums[a_pointer],nums[a_pointer]+1};
            } else {
                a_pointer++;
                b_pointer++;
            }

        }

        return new int[]{};
    }
}