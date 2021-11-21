li = [[]*10 for _ in range(10)]
for i in range(10):
	li[i] = list(map(int, input().split()))
x, y = 1, 1
arr = [(0, 1), (1, 0), (0, -1), (-1, 0)]
while True:
    cnt = 0
    for i in range(4):
        if x==8 and y==8:
            cnt=4
            break
        if li[x+arr[i][0]][y+arr[i][1]] == 2:
            li[x][y] = 9
            x, y = x+arr[i][0], y+arr[i][1]
            li[x][y] = 9
            cnt = 4
            break
        if li[x+arr[i][0]][y+arr[i][1]] == 0:
            li[x][y] = 9
            x, y = x+arr[i][0], y+arr[i][1]
            break
        cnt += 1
    if cnt == 4:
        break

for i in range(10):
    for j in range(10):
        print(li[i][j], end=' ')
    print()
