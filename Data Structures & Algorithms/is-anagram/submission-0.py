class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s)!= len(t):
            return False;
        list1 = {}
        list2 = {}

        for i in range(len(s)):
            list1[s[i]] = 1 + list1.get(s[i],0)
            list2[t[i]] =  1 + list2.get(t[i],0)
        return list1==list2;

        


        
        