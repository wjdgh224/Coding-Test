from collections import deque

n = int(input())
graph = [[] for _ in range(n+1)]
indegree = [0] * (n+1)
cost = [0] * (n+1)
result = [0] * (n+1)

for i in range(1, n+1):
    li = list(map(int, input().split()))
    # cost[i] = li[0]
    # for x in li[1:-1]:
    #     indegree[i] += 1
    #     graph[x].append(i)
    for j in range(0, len(li)):
        if j==0:
            cost[i] = li[j]
        elif j==len(li)-1:
            break
        else:
            graph[li[j]].append(i)
            indegree[i] += 1

for i in range(1, n+1):
    result[i] = cost[i]

def topology_sort():
    q = deque()
    for i in range(1, n+1):
        if indegree[i] == 0:
            q.append(i)
    while q:
        now = q.popleft()
        for i in graph[now]:
            result[i] = max(result[now] + cost[i], result[i]) #최소한으로 들었다는 것은 다른 선수 과목을 거치지 않은 것.
            indegree[i] -= 1
            if indegree[i] == 0:
                q.append(i)

topology_sort()
for i in range(1, n+1):
    print(result[i])
"""
5
10 -1
10 1 -1
4 1 -1
4 3 1 -1
3 3 -1
"""