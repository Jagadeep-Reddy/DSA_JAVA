class Solution(object):
    def findErrorNums(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        my_list = []
        s = set()
        dup =-1
        for i in nums:
            if i in s:
                dup =i
            s.add(i)
        n = len(nums)
        for j in range(1,n+1):
            if j not in s:
                mis = j
        my_list.append(dup)
        my_list.append(mis)
        return my_list