class Solution:
    def findCheapestPrice(self, n, flights, src, dst, k):
        dp = [[sys.maxsize for _ in range(n)] for _ in range(k+2)]
        for i in range(k+2):
            dp[i][src] = 0
        for i in range(1, k+2):
            for f in flights:
                if dp[i-1][f[0]] != sys.maxsize:
                    dp[i][f[1]] = min(dp[i][f[1]], dp[i-1][f[0]] + f[2])
        return dp[k+1][dst] if dp[k+1][dst] != sys.maxsize else -1