class Solution {
    public int maximumProduct(int[] nums) {
        int i,n,j;
        n=nums.length;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(nums[i]>nums[j]){
                    int t=nums[i];
                    nums[i]=nums[j];
                    nums[j]=t;
                }
            }
        }
        int p1 = nums[n-1] * nums[n-2] * nums[n-3];
        int p2 = nums[0] * nums[1] * nums[n-1];
        return (p1 > p2) ? p1 : p2;
    }
}