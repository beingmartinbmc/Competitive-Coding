cache = {}


def fact(n):
    if n in cache:
        return cache[n]
    else:
        if n == 0:
            cache[n] = 1
            return 1
        if n == 1:
            cache[n] = 1
            return 1
        else:
            cache[n] = n * fact(n-1)
        return cache[n]



def get_answer(n):
    factorial = fact(n)
    first_digit = str(factorial)[0]
    ten_power = len(str(factorial)) - 1
    return first_digit, ten_power


def main():
    t = int(input())
    while t > 0:
        n = int(input())
        print(*get_answer(n))
        t -= 1


main()
