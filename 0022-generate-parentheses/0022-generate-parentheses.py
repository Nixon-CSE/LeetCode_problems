class Solution:
    def generateParenthesis(self, n: int) -> list[str]:
        result = []

        def buildString(current_str, open_cnt, close_cnt):
            if(len(current_str)) == 2*n:
                result.append(current_str)
                return

            if open_cnt < n:
                buildString(current_str + "(", open_cnt+1, close_cnt )
                
            if close_cnt < open_cnt:
                buildString(current_str + ")", open_cnt, close_cnt+1)

        buildString("",0,0)
        return result
