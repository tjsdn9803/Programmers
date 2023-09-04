def solution(s):
    answer = -1
    li = []
    for i in range(len(s)):
        if(len(li) == 0):
            li.append(s[i])
        else:
            if(s[i] != li[len(li)-1]):
                li.append(s[i])
            else:
                del li[len(li) - 1]
        
    print(li)
    if(len(li) != 0):
        return 0
    else:
        return 1
