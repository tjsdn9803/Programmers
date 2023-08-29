def solution(nums):
    select = set(nums)
    answer = 0
    answer = min(len(nums)/2, len(select))
            
    return answer