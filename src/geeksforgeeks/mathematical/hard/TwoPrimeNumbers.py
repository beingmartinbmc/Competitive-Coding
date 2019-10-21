primes = []

def generate_primes(n):
    global primes
    p = [True] * (n + 1)
    p[0] = p[1] = False
    for i in range(2, int(n ** 0.5) + 1):
        if p[i]:
            for j in range(i*i, n + 1, i):
                p[j] = False
    for i in range(n+1):
        if p[i]:
            primes.append(i)
    return primes


def get_primes(s):
    global primes
    i = 0
    j = len(primes) - 1
    while i < j:
        if primes[i] + primes[j] == s:
            print(primes[i], primes[j])
            break
        elif primes[i] + primes[j] < s:
            i += 1
        else:
            j -= 1


def main():
    generate_primes(10000)
    t = int(input())
    while t > 0:
        s = int(input())
        get_primes(s)
        t -= 1


main()
