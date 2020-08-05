def isTen(n):
    sum = 0
    while(n):
        sum += n%10
        n = n//10
        if(sum > 10):
            break
    if(sum == 10):
        return True
    return False

lis = []
start = 19
for i in range(1900001):
    if(isTen(9 * i + 10)):
        lis.append(9 * i + 10)

n = int(input())
print (lis[n-1])

