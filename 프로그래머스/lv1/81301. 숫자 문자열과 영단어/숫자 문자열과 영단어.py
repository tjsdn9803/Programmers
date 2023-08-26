def solution(s):
    alphabet = ["zero", "one","two","three","four","five","six","seven","eight","nine"]
    answer = 0
    for i,alpha in enumerate(alphabet):
        s = s.replace(alpha, str(i))
    return int(s)