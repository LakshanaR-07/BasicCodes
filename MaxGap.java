class Solution {
    public int maximumGap(int[] nums) {
     int i,j,max=0;
     int n=nums.length;
      Arrays.sort(nums);
     for(i=0;i<n-1;i++){
        int g=nums[i+1]-nums[i];
        if(max<g){
            max=g;
            }
        }   
     return max;
    }
}