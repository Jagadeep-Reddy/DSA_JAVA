class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] arr = new int[2];
        int low = 0;
        int high = n-1;
        int mid =0;
        arr[0] = -1;
        arr[1] = -1;
        while(low<=high)
        {
            mid = (low+high)/2;
            if(nums[mid] == target)
            {
                arr[0] = mid;
                high = mid-1;
            }
            else if(nums[mid]<target)
            {
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        low = 0;
        high = n-1;
        mid =0;
        while(low<=high)
        {
            mid = (low+high)/2;
            if(nums[mid] == target)
            {
                arr[1] = mid;
                low = mid+1;
            }
            else if(nums[mid]<target)
            {
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
    return arr;
    }
}