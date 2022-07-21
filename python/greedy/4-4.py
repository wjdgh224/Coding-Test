n, m = map(int, input().split())
x, y, d = map(int, input().split())
temp = [[0]*m for _ in range(n)]#이동 표시
array = []
steps = [(0, 1), (1, 0), (0, -1), (-1, 0)]

for i in range(n):
    array.append(list(map(int, input().split())))

temp[x][y] = 1
turn_cnt = 0
count = 1
while(True):
    d = (d-1+4)%4
    next_x = x + steps[d][0]
    next_y = y + steps[d][1]
    if temp[next_x][next_y]==0 and array[next_x][next_y]==0:
        x = next_x
        y = next_y
        temp[x][y] = 1
        count += 1
        turn_cnt = 0
        continue
    else:
        turn_cnt += 1
    if turn_cnt == 4:
        next_x = x - steps[d][0]
        next_y = y - steps[d][1]
        if array[next_x][next_y]==1:
            break
        x = next_x
        y = next_y
        turn_cnt = 0

print(count)

    