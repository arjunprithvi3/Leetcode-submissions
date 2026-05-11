class Solution {
    public String longestCommonPrefix(String[] strs) {

        int n = strs.length;
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);

        char[] f = strs[0].toCharArray();
        char[] l = strs[n-1].toCharArray();

        int len = Math.min(f.length,l.length);

        for(int i=0;i<len;i++)
        {
            if(f[i]!=l[i])
            {
                break;
            }
            sb.append(f[i]);
        }
        return sb.toString();
        
    }
}