class Solution {
    private ArrayList<List<String>> res;
    public List<List<String>> partition(String s) {
        res = new ArrayList<>();
        ArrayList<String> sub = new ArrayList<>();
        dfs(sub,s);
        return res;
    }

    private void dfs(List<String> subset,String s){
       if(s.length()==0){
          res.add(new ArrayList<>(subset));
          return;
       } 

       for(int j=0;j<s.length();j++){
            String substr = s.substring(0,j+1);
            if(isPali(s,0,j)){
                System.out.println(substr);
                subset.add(substr);
                dfs(subset,s.substring(j+1,s.length()));
                subset.remove(subset.size()-1);
            }
       }
    }

    private boolean isPali(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

}
