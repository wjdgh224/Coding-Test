n = int(input())
array = [0]*1000001

for i in input().split():
    array[int(i)] = 1

m = int(input())
x = list(map(int, input().split()))

for i in x:
    if array[i]==0:
        print('no', end=' ')
    else:
        print('yes', end=' ')