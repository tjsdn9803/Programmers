def solution(num):
    arr = list(str(num))
    arr.reverse()
    return list(map(int, arr))