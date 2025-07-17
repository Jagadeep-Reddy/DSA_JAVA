class Solution {
    public boolean search(int[] nums, int target) {
        int n=nums.length;
        mergeSort(0,n-1,nums);
        int low=0;
        int high = n-1;
        int mid=0;
        while(low<=high)
        {
            mid = (low+high)/2;
            if(nums[mid] == target)
            {
                return true;
            }
            else if(nums[mid]<target)
            {
                low=mid+1;
            }
            else{
                high = mid-1;
            }
        }
    return false;
    }
    public void mergeSort(int low, int high,int[]nums)
    {
        if(low==high)
        {
            return;
        }
        int mid = (low+high)/2;
        mergeSort(low,mid,nums);
        mergeSort(mid+1,high,nums);
        merge(low,mid,high,nums);
    }
    public void merge(int low, int mid,int high, int[]nums)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left<=mid && right<=high)
        {
            if(nums[left]<=nums[right])
            {
                list.add(nums[left]);
                left++;
            }
            else
            {
                list.add(nums[right]);
                right++;
            }
        }
        while(left<=mid)
        {
            list.add(nums[left]);
            left++;
        }
        while(right<=high)
        {
            list.add(nums[right]);
            right++;
        }
        for(int i=low;i<=high;i++)
        {
            nums[i] = list.get(i-low);
        }
    }
}