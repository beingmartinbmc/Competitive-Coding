def isPalindrome(a):
    i = 0
    j = len(a) - 1
    while i < j:
        if a[i] != a[j]:
            return False
        i += 1
        j -= 1
    return True


def isOdd(a):
    if (len(a) & 1) == 1:
        return 'ODD'
    else:
        return 'EVEN'


def main():
    t = int(input())
    while t > 0:
        a = input()
        if isPalindrome(a):
            print('YES', isOdd(a))
        else:
            print('NO')
        t -= 1


main()
