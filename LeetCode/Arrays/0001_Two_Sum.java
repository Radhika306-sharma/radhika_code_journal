/*
Problem: 1. Two Sum
Topics: Array, Brute Force
Difficulty: Easy
Language: Java

Approach:
- Brute Force
- Check every pair

Time Complexity: O(n²)
Space Complexity: O(1)

Solved on: 16 July 2026
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
