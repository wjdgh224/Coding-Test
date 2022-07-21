n, m = map(int, input().split())
li = []
for i in range(n):
    li.append(int(input()))

dp = [10001] * (m+1)
dp[0] = 0

for i in range(n):
    for j in range(li[i], m+1): #돈 범위
        if dp[j-li[i]] != 10001: #더하기 전에 값이 존재하면
            dp[j] = min(dp[j], dp[j-li[i]] + 1)

if dp[m] == 10001:
    print(-1)
else:
    print(dp[m]) 