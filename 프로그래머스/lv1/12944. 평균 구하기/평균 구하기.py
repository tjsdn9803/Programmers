def solution(arr):
    answer = 0
    for i in arr:
        answer += i
    print(len(arr))
    return answer / len(arr)