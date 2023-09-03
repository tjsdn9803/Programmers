def solution(n):
    answer = 0
    ones = bin(n)[2:].count('1')
    for i in range(n+1,1000000):
        newOnes = bin(i)[2:].count('1')
        if(newOnes == ones):
            return i
        
        
    return answer