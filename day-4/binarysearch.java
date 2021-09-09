// 704. Binary Search
// Easy

// 1911

// 73

// Add to List

// Share
// Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

// You must write an algorithm with O(log n) runtime complexity.
class Solution {
    public int search(int[] nums, int target) {
        int first =0;
        int last = nums.length-1;
        if(nums.length ==1)
        {
            if(target==nums[0])
                return 0;
        }
        while(first<=last)
        {
            int mid = first+(last-first)/2;
            
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(target>nums[mid])
            {
                first = mid+1;
            }
            else{
                last = mid-1;
            }
        }
        return -1;
    }
}