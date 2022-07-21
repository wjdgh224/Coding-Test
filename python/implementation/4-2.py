n = int(input()) #in으로 확인?

hour, min, sec, cnt = 0, 0, 0, 0

while True:
    if hour==n+1:
        break
    if '3' in str(hour) or '3' in str(min) or '3' in str(sec):
        cnt += 1
    sec += 1
    if sec==60:
        sec = 0
        min += 1
    if min==60:
        min = 0
        hour += 1
print(cnt)