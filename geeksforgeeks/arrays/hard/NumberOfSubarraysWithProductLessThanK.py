def get_count(a, k):
    s = 0
    e = 0
    p = 1
    count = 0
    for e in range(len(a)):
        p *= a[e]
        while p >= k and s < e:
            p //= a[s]
            s += 1
        if p < k:
            l = e - s + 1
            count += l
    return count


def main():
    t = int(input())
    while t > 0:
        n, k = map(int, input().split())
        a = [int(i) for i in input().split()]
        print(get_count(a, k))
        t -= 1


main()