li = [[]*19 for _ in range(19)]
for i in range(19):
	li[i] = list(map(int, input().split()))
n = int(input())
for _ in range(n):
    x, y = map(int, input().split())
    for i in range(19):
        if li[x-1][i] == 1:    
            li[x-1][i] = 0
        else:
            li[x-1][i] = 1
            
        if li[i][y-1] == 1:    
            li[i][y-1] = 0
        else:
            li[i][y-1] = 1

for i in range(19):
    for j in range(19):
        print(li[i][j], end = ' ')
    print()