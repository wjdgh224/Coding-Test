n = int(input())
li = list(map(int, input().split()))

dp = [0] * 101
dp[0] = li[0]
dp[1] = max(li[1], li[0])

for i in range(2, n):
    dp[i] = max(dp[i-1], li[i] + dp[i-2])

print(dp[n-1])