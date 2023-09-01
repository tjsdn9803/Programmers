def solution(s):
    s = s.split(" ")
    min = 9999999
    max = -9999999
    for i in s:
        if(min > int(i)): min = int(i)
        if(max < int(i)): max = int(i)
    answer = str(min) + ' ' + str(max) 
    return answer