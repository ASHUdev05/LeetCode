class Solution {
    private int usableSize(int n, int target){
        if(n>target)
            usableSize(n/2, target);
        else if(n<target)
            usableSize(n+(n/2), target);
        return n;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] pos = new int[2];
        pos[0]=pos[1]=-1;
        if(nums.length == 0 || nums[nums.length-1]<target)
            return pos;

        //int l=usableSize(nums.length, target);
        int l=nums.length;

        for(int i=0; i<l; i++) {
            if(nums[i]==target){
                pos[0]=i;
                break;
            }
        }

        for(int i=nums.length-1; i>=0; i--) {
            if(nums[i]==target){
                pos[1]=i;
                break;
            }
        }
        return pos;
    }
}