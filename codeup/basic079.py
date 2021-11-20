n = int(input())
i = 1
sum = 0
while True: #45~54까지 9 55부터 10
    sum += i
    if sum+(i+1) > n:
        break
    i += 1
print(i)