class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> mp =  new HashMap<>();        

        for(int i=0;i<strs.length;i++){
            char[] curStrArray= strs[i].toCharArray();
            Arrays.sort(curStrArray);
            String key = new String(curStrArray);

            if(mp.containsKey(key)){
                mp.get(key).add(strs[i]);
            }
            else{
                mp.put(key,new ArrayList<>(Arrays.asList(strs[i])));
            }           
        }        
        return new ArrayList<>(mp.values());
    }
}
