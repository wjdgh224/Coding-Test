n = input()

li = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'] #알파벳에 숫자를 대입
move = [(-1,2), (1, 2), (2, 1), (2, -1), (1, -2), (-1, -2), (-2, -1), (-2, 1)]

r = int(n[1])
c = 0
for j in range(8):
    if n[0] == li[j]:
        c = j+1
#현재 위치 구함
cnt = 0
for i in move:
    if (r+i[0] >= 1 and r+i[0] <=8) and (c+i[1] >= 1 and c+i[1] <=8):
        cnt += 1
print(cnt)
