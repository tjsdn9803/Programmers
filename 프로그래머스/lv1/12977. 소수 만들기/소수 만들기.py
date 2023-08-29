from itertools import combinations

def solution(nums):
    answer = 0
    for i in combinations(nums, 3):
        number = sum(i)
        for j in range(2,number):
            if(number % j == 0):
                break
        else:
            answer += 1
                
    return answer