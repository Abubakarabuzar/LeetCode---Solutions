class Solution {
    public int[] rearrangeArray(int[] nums) {
        // int []ans=new int[nums.length];

        // // int n=nums.length;
        // int p=0;
        // int N=1;
        // for(int i:nums){
        //     if(i>0){
        //         ans[p]=i;
        //         p+=2;


        //     }
        //     else{
        //         ans[N]=i;
        //         N+=2;
        //     }
           
        //     }
        //     return ans;
        int [] narr=new int[nums.length];
        int P=0;
        int N=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                narr[P]=nums[i];
                P+=2;

            }
            else{
                narr[N]=nums[i];
                N+=2;
            }
        }
        return narr;
        
    }
}
