class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder st=new StringBuilder();
        char ch= ' ';
        int min=Integer.MAX_VALUE;
        int count=0;
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<min){
                min=strs[i].length();
            }

        }
         for(int i=0;i<min;i++){
           
            ch=strs[0].charAt(i);
            count=1;
            for(int j=1;j<strs.length;j++){
                if(ch==(strs[j].charAt(i))){
                    count++;
                }
                else{
                   return st.toString();
                }
                
            }
            if(count==strs.length){
                st.append(ch);
            }

        }
        return st.toString();
        
        
        
    }
}