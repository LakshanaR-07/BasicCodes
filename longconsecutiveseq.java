class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        TreeSet<Integer> ts = new TreeSet<>();
        int i;
        for(i=0;i<nums.length;i++){
            ts.add(nums[i]);
        }
        List<Integer> list = new ArrayList<>(ts);
        int c=1,max=1;
        for(i=1;i<list.size();i++){
            if(list.get(i)==list.get(i-1)+1){
                c++;
            }
            else {
                max = Math.max(max, c);
                c= 1;
            }
        }
        return Math.max(max, c);
    }
}