#dfs로 구현 어려움, bfs로 구현 해보자 -> 출발 지점부터 이동한 지점 만큼 더하면 된다
#bfs는 인접 노드 즉 같은 거리에 있으면 동일하게 증가하지만
#dfs는 같은 거리라도 다른 길을 통해서 도착하는 경우가 있다. 그래서 그 경우 까지 고려해야함
from collections import deque

n, m = map(int, input().split())
graph = []
for _ in range(n):
    graph.append(list(map(int, input())))

def dfs(x, y, cnt):
    if not(x>=0 and x<n and y>=0 and y<m):
        return
    elif graph[x][y] > 1:
        if graph[x][y] > cnt:
            graph[x][y] = cnt
    elif graph[x][y] == 1:
        graph[x][y] = cnt
        dfs(x, y+1, cnt+1)
        dfs(x, y-1, cnt+1)
        dfs(x+1, y, cnt+1)
        dfs(x-1, y, cnt+1)
    elif graph[x][y] == 0:
        return
dfs(0, 0, 1)
print(graph)

# dx = [-1, 1, 0, 0]
# dy = [0, 0, -1, 1]

# def bfs(x, y):
#     queue = deque()
#     queue.append((x,y))
#     while queue:
#         x, y = queue.popleft()
#         for i in range(4):
#             nx = x + dx[i]
#             ny = y + dy[i]
#             if nx < 0 or ny < 0 or nx >=n or ny >= m:
#                 continue
#             if graph[nx][ny] == 0:
#                 continue
#             if graph[nx][ny] == 1:
#                 graph[nx][ny] = graph[x][y] + 1
#                 queue.append((nx, ny))
#     return graph[n-1][m-1]


# print(bfs(0,0))
# print(graph)
"""
5 6
101010
111111
000001
111111
111111
"""