def solution(n, words):
    answer = [0,0]
    said = []
    for i in range(len(words)):
        if(len(said) == 0):
            said.append(words[i])
        else:
            if(said[-1][-1] != words[i][0] or words[i] in said):
                return [i%n + 1, i//n + 1]
            else:
                said.append(words[i])

    return answer