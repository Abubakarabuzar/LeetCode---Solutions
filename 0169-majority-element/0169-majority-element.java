class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        int can=0;
        for(int x:nums){
            if(c==0){
                can=x;
            }
            if(x==can){
                c++;
            }
            else{
                c--;
            }
        }
        return can;
        

    }
}