int majorityElement(int* nums, int numsSize) {
    int c=0,i;
    int a=0;
    for(i=0; i < numsSize; i++) {
        if(c == 0) {
            a=nums[i];
        }
        if(nums[i]==a) {
            c++;
        } else {
            c--;
        }
    }
    return a;
}