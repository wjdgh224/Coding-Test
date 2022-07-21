def find_parent(parent, x):
    if parent[x] != x:
        parent[x] = find_parent(parent, parent[x])
    return parent[x]

#탐색과 동시에 루트 노드를 같은 집합에 적용