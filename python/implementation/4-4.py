n, m = map(int, input().split())
r, c, d = map(int, input().split())
dir = [0, 1, 2, 3] #북, 동, 남, 서
move = [(-1, 0), (0, 1), (1, 0), (0, -1)]

def direction(now):
    dir = -1
    if now==0:
        dir = 3
    elif now==1:
        dir = 0
    elif now==2:
        dir = 1
    else:
        dir = 2
    return dir
li = []
for i in range(n):
    li.append(list(map(int, input().split())))
print(li)

cnt = 1
li[r][c] = 2 #방문했음
rotation = 0
while True:
    rotation += 1
    next_d = direction(d) #다음 왼쪽 방향
    next_r = r + move[next_d][0] #다음 행
    next_c = c + move[next_d][1] #다음 열
    if li[next_r][next_c] == 0: #길이 있다면
        rotation = 0
        li[next_r][next_c] = 2
        cnt += 1
        r = next_r
        c = next_c
    d = next_d #길이 있든 없든 방향은 지속적으로
    if rotation == 4: #한 바퀴 회전
        if li[r-move[d][0]][c-move[d][1]] == 2: #뒤쪽 왔던 길
            r = r - move[d][0]
            c = c - move[d][1]
            rotation = 0
        else: #바다로 막힘
            break
print(cnt)

# 4 4
# 1 1 0
# 1 1 1 1
# 1 0 0 1
# 1 1 0 1
# 1 1 1 1