// Given an array, rotate the array to the right by k steps, where k is non-negative.

 

// Example 1:

// Input: nums = [1,2,3,4,5,6,7], k = 3
// Output: [5,6,7,1,2,3,4]
// Explanation:
// rotate 1 steps to the right: [7,1,2,3,4,5,6]
// rotate 2 steps to the right: [6,7,1,2,3,4,5]
// rotate 3 steps to the right: [5,6,7,1,2,3,4]


class Solution {
    public void rotate(int[] nums, int k) {
        int [] arrright = rotateright(nums,k);
        for(int i =0;i<nums.length;i++)
        {
            System.out.print(nums[i]);
        }
    }
    public static void reverse(int[] arr, int start,int end) // 0 end = length
    {
        while(start<end)
        {
            int temp= arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
    }
    public static int [] rotateright(int arr[],int k)
    {
        k=k%arr.length;
        reverse(arr,0,arr.length-1);// reverse entire array
        reverse(arr,0,k-1); // first k elements reverse
        reverse(arr,k,arr.length-1); // remaining elements reverse
        
        return arr;
        
    }
}
