def main():
    n , q = map(int, input().split())
    a = [int(i) for i in input().split()]
    while q > 0:
        lines = [int(i) for i in input().split()]
        if lines[0] == 1:
            a[lines[1] - 1] ^= 1
        if lines[0] == 0:
            if a[lines[2] - 1] == 1:
                print('ODD')
            else:
                print('EVEN')
        q -= 1


main()
