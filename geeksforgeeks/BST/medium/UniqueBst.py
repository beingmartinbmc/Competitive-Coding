def f(n, cache):
    if n in cache:
        return cache[n]
    else:
        if n <= 1:
            cache[n] = 1
            return cache[n]
        else:
            cache[n] = n * f(n - 1, cache)
        return cache[n]


def catalan(n):
    cache = {}
    return f(2 * n, cache) // (f(n, cache) * f(n + 1, cache))


def main():
    t = int(input())
    while t > 0:
        n = int(input())
        print(catalan(n))
        t -= 1


main()
