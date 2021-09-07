// Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

// Return any array that satisfies this condition.

 

// Example 1:

// Input: nums = [3,1,2,4]
// Output: [2,4,3,1]
// Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

class Solution {
    public int[] sortArrayByParity(int[] nums) {
     int first = 0;
        int i =0;
        int last = nums.length-1;
        
        int temp = 0;
        
        while(i<=last)
        {
            if(nums[i]==0)
            {
                temp = nums[i];
                nums[i]= nums[first];
                nums[first]=temp;
                
                first++;
                i++;
            }
            
            else if(nums[i]%2==0)
            {
                i++;
            }
            else{
                temp = nums[i];
                nums[i]=nums[last];
                nums[last]=temp;
                
                last--;
            }
        }
        return nums;
    }
}