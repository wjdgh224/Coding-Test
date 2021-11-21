a, m, d, n = map(int, input().split())
sum = a
for _ in range(n-1):
	sum = sum*m + d
print(sum)