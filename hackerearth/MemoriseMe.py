def main():
    n = int(input())
    a = [int(i) for i in input().split()]
    frequency = {}
    for i in a:
        if i not in frequency:
            frequency[i] = 1
        else:
            frequency[i] += 1
    q = int(input())
    while q > 0:
        c = int(input())
        if c in frequency:
            print(frequency[c])
        else:
            print('NOT PRESENT')
        q -= 1


main()
