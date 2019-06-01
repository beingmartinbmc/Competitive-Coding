class GfG
{
    private char[] preprocessString(String s){
        char[] t = new char[s.length() * 2 + 1];
        t[0] = '#';
        for(int i=0; i<s.length(); i++){
            t[2 * i + 1] = s.charAt(i);
            t[2 * i + 2] = '#';
        }
        return t;
    }
    private String longestPalindrome(String s) {
        char[] t = preprocessString(s);
        int[] p = new int[t.length];
        int centre = 0, max = 0, index = 0, right = 0;
        for(int i=0; i<p.length; i++){
            int mirror = 2 * centre - i;
            if(i < right) p[i] = Math.min(p[mirror], right - i);
            while(i + p[i] < t.length && i - p[i] >= 0 && t[i + p[i]] == t[i - p[i]])
                p[i]++;
            if(i + p[i] > right){
                right = i + p[i];
                centre = i;
            }
            if(max < p[i]){
                max = p[i];
                index = i;
            }
        }
        if(max == 2) return s.length() > 1 ? s.charAt(1)+"" : "";
        int start = index - 1 - max;
        int end = index - 1 + max;
        return s.substring(start/2+1, end/2);
    }
    public void findLongestPalindromicString(String t){
        System.out.println(longestPalindrome(t));
    }
}
