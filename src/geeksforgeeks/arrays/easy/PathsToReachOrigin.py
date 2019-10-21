def ways(n, m, cache):
    key = str(n) + ' -> ' + str(m)
    if key in cache:
        return cache[key]
    else:
        if n == 0 or m == 0:
            cache[key] = 1
            return 1
        else:
            cache[key] = ways(n - 1, m, cache) + ways(n, m-1, cache)
        return cache[key]


def main():
    t = int(input())
    while t > 0:
        n, m = map(int, input().split())
        cache = {}
        print(ways(n, m, cache))
        t -= 1


main()