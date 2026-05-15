class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 
                        53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        HashMap<Integer,List<String>> mp =  new HashMap<>(); 

        for(int i=0;i<strs.length;i++){
            int prod=1;
            for(char c : strs[i].toCharArray()){
                prod=prod*primes[c-'a'];
            } 
            if(mp.containsKey(prod)){
                mp.get(prod).add(strs[i]);
            }
            else{
                mp.put(prod,new ArrayList<>(Arrays.asList(strs[i])));
            }  
        }
        return new ArrayList<>(mp.values());
    }
}
