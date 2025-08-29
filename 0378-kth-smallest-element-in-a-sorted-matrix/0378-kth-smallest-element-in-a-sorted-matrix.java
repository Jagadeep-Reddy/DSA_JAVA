class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int count=0;
        ArrayList<Integer> list = new ArrayList<>();
        int j=0;
        int i=0;
        while(j<matrix.length)
        {
            
            list.add(matrix[j][i]);
            count++;
            i++;
            if(count == matrix.length)
            {
                count=0;
                i=0;
                j++;
            }  
        }
        Collections.sort(list);
        return list.get(k-1);
    }
}