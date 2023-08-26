def solution(sizes):
    answer = 0
    maxX = 0
    maxY = 0
    for card in sizes:
        maxX = max(max(card), maxX)
        maxY = max(min(card), maxY)
    return maxX * maxY