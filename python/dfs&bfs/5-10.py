n, m = map(int, input().split())

graph = []
for _ in range(n):
    graph.append(list(map(int, input()))) #문자열을 바로 넣을 때 변경 불가.

def dfs(x, y):
    if not(x>=0 and x<=n-1 and y>=0 and y<=m-1): #범위 벗어남
        return False
    if graph[x][y]==0:
        graph[x][y] = 1
        dfs(x-1, y)
        dfs(x+1, y)
        dfs(x, y+1)
        dfs(x, y-1)
        return True
    else:
        return False


result = 0
for i in range(n):
    for j in range(m):
        if dfs(i, j)==True:
            result += 1
print(result)




"""
15 14
00000111100000
11111101111110
11011101101110
11011101100000
11011111111111
11011111111100
11000000011111
01111111111111
00000000011111
01111111111000
00011111111000
00000001111000
11111111110011
11100011111111
11100011111111
"""