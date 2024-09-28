class Solution(object):
    def addBoldTag(self, s, words):

        flags = [False for x in s]
        
        for w in words:
            length = len(w)
            for i in range(len(s)):
                if s[i: i + length] == w:
                    for x in range(i, i + length):
                        flags[x] = True
        answer = []
        i = 0
        while i < len(s):
            if flags[i]:
                answer.append("<b>")
                while(i < len(s) and flags[i]):
                    answer.append(s[i])
                    i+=1
                answer.append("</b>")
            else:
                answer.append(s[i])
                i+=1

        return "".join(answer)




