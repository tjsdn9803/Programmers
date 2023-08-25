def solution(price, money, count):
    fee = 0
    for i in range(count):
        fee += (i+1) * price
    if(money - fee > 0):
        return 0
    else:
        return fee - money