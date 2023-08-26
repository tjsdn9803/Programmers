def solution(n, arr1, arr2):
    answer = []
    for a,b in zip(arr1, arr2):
        binary = str(bin(a|b)[2:])
        binary = binary.replace("1","#")
        binary = binary.replace("0"," ")
        binary = " "*(n-len(binary)) + binary
        answer.append(binary)
        
        
    return answer