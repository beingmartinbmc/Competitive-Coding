def get_count(a):
    c = 0
    for i in a:
        if i < 0:
            c += 1
    return c


def max_sum(a):
    s = 0
    answer = 0
    for i in a:
        s += i
        if s < 0: s = 0
        answer = max(answer, s)
    return answer


def main():
    t = int(input())
    while t > 0:
        n = int(input())
        a = [int(i) for i in input().split()]
        if get_count(a) == n:
            print(max(a))
        else:
            max_kadanes = max_sum(a)
            s = 0
            for i in range(len(a)):
                s += a[i]
                a[i] *= -1
            s += max_sum(a)
            print(max(s, max_kadanes))
        t -= 1


main()
        
