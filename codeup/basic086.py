n = int(input())
i = 1
sum = 0
for i in range(n):
	sum += i
	if sum >= n:
		break
	i += 1
print(sum)