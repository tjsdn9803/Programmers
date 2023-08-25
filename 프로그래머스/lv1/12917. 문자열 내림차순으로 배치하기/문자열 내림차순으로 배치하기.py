def solution(s):
    ls = list(s)
    ls.sort(reverse = True)
    return "".join(ls)