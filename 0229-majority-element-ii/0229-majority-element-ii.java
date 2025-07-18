class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            if(e.getValue() > n/3){
                 list.add(e.getKey());
            }  
        }
    return list;
    }
}