class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k%=n;
        reverse(0,n-1,nums);
        reverse(0,k-1,nums);
        reverse(k,n-1,nums);
    }
    public void reverse(int low, int high, int []nums)
    {
        int temp=0;
        while(low<=high)
        {
            temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
        }
    }
}