def countVowels(a):
    a = a.lower()
    c = 0
    for i in a:
        if i == 'a' or i == 'e' or i == 'o' or i == 'u' or i == 'i':
            c += 1
    return c

def main():
    t = int(input())
    while t > 0:
        s = input()
        print(countVowels(s))
        t -= 1


main()
