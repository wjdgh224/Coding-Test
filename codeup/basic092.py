n = int(input())
li = list(map(int, input().split()))
re = [0]*24
for i in li:
    re[i-1] += 1
for i in re:
    print(i ,end=' ')