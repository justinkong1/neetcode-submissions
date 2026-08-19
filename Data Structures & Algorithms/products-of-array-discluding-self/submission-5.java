class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeros=0;
        int product=1; // doesn't need to include the 0 at all.
        for(int i:nums) {
            if(i==0){
                zeros++;
                if(zeros==2) {
                    return new int[nums.length];
                }
            } else {
                product=product*i;
            }
        }
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(zeros == 1) {
                if(nums[i] == 0) {
                    res[i]=product;
                }
            } else {
                res[i]=product/nums[i];
            }
        }
        return res;
    }
}  

/*
[1,2,0,4,5]
we would need a 0 count
if 0 count is > 1:
    then no matter what it would all be 0s.
else:
    (this should handle if 0 count is 1 or 0)
    then we would need to calculate the product of all nums
    not including the 0
    and then when we reach the 0
    we simply skip the calculation, but mark it
    in the res array

    if we know the there is a zero
        and nums[i] is not zero
            then we mark as 0
        if nums[i] IS zero
            then carry on with calculations like so


*/