def solution(n,a,b):
    answer = 0
    while True: 
        answer += 1
        if((a-1)//2 == (b-1)//2):
            break;
        else:
            a = ((a-1)//2) + 1
            b = ((b-1)//2) + 1


    return answer