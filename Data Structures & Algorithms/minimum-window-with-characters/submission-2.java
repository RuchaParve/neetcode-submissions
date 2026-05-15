


class Solution {
    public String minWindow(String s, String t) {
        if(t.isEmpty()) return "";

        Map<Character,Integer> window = new HashMap<>();
        Map<Character,Integer> Tcount = new HashMap<>();

        for(char ch : t.toCharArray()){
            Tcount.put(ch,Tcount.getOrDefault(ch,0)+1);
        }

        int need = Tcount.size();
        int[] res = {-1,-1};
        int resLen = Integer.MAX_VALUE;

        int l=0;
        int have = 0;
        for(int r=0;r<s.length();r++){
            char ch = s.charAt(r);

            window.put(ch,window.getOrDefault(ch,0)+1);

            if(Tcount.containsKey(ch) && Tcount.get(ch).equals(window.get(ch))){
                have++;
            }

            while(need==have){
                if((r-l+1<resLen)){
                    resLen = r-l+1;
                    res[0]=l;
                    res[1]=r;
                }

                char leftChar = s.charAt(l);
                window.put(leftChar,window.get(leftChar)-1);
                if (Tcount.containsKey(leftChar) && window.get(leftChar) < Tcount.get(leftChar)) {
                    have--;
                }
                l++;
            }
        }

        return resLen==Integer.MAX_VALUE ? "" : s.substring(res[0],res[1]+1);

    }
}








