cache_hit = 1
cache_miss = 5

def solution(cacheSize, cities):
    answer = 0
    cache = []
    old = 0
    for city in cities:
        if city.lower() in cache:
            cache.remove(city.lower())
            cache.append(city.lower())
            answer += cache_hit
        else:
            answer += cache_miss
            if cacheSize != 0:
                if len(cache) == cacheSize:
                    cache.pop(0)
                cache.append(city.lower())
    return answer