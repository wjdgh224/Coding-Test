n = int(input())
array = []

for i in range(n):
    array.append(int(input()))

array.sort()

for i in range(n-1,-1,-1):
    print(array[i], end=' ')