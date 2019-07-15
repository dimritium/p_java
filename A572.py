n = int(input())
s = input()
i = 0

if(s.count('1') != s.count('0')):
    print (1)
    print (s)
else:
    while(((s[0:i+1]).count('0') == (s[0:i+1]).count('1')) or ((s[i+1:]).count('0') == (s[i+1:]).count('1')) and i < n):
        i+=1

    if(i == n):
        print (1)
        print (s)
    else:
        print (2)
        print (s[:i+1] + " " + s[i+1:])