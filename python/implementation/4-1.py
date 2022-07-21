n = int(input())
move = input().split()

dir = [(0, 1), (1, 0), (0, -1), (-1, 0)] #R D L U

r = 1
c = 1
for i in move:
    temp = 0
    if i=="R":
        temp = dir[0]
    elif i=="D":
        temp = dir[1]
    elif i=="L":
        temp = dir[2]
    else:
        temp = dir[3]
    if (r+temp[0] >=1 and r+temp[0] <=n) and (c+temp[1] >=1 and c+temp[1] <= n):
        r = r+temp[0]
        c = c+temp[1]
print(r, c)