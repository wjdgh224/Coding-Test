a, b, c = map(int, input().split())
mi = min(a,b)
mi = min(mi, c)
print(mi)
print((b if (b<a) else a) if ((b if (b<a) else a)<c) else c)