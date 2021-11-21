n = int(input())
li = list(map(int, input().split()))
for i in range(n):
    print(li[n-i-1], end=' ')