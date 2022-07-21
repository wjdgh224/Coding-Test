import heapq
import sys
input = sys.stdin.readline

INF = int(1e9)

n, m, c = map(int, input().split())
graph = [[] for i in range(n+1)]
distance = [INF]*(n+1)

for _ in range(m):
    x, y, z = map(int, input().split())
    graph[x].append((y, z))

def dijkstr(start):
    q = []
    distance[start] = 0
    heapq.heappush(q, (0, start))
    while q:
        dist, now = heapq.heappop(q)
        if distance[now] < dist:
            continue
        for i in graph[now]:
            cost = dist + i[1]
            if cost < distance[i[0]]:
                distance[i[0]] = cost
                heapq.heappush(q, (cost, i[0]))

dijkstr(c)

count = 0
max_distance = 0
for i in distance:
    if i != INF:
        count += 1
        max_distance = max(max_distance, i)

print(count-1, max_distance) #출발지점 distance가 0이므로 제외
