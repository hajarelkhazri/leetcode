class Solution:
    def reverseString(self, s: List[str]) -> None:
        left=0
        rigth=len(s)-1
        while left<rigth:
            s[left], s[rigth]=s[rigth],s[left]
            left=left+1
            rigth=rigth-1
