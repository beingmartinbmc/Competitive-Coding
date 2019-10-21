def get_digit(base, power):
    unit = power % 10
    ten = (base // 10) % 10
    return (unit * ten) % 10


def main():
    t = int(input())
    while t > 0:
        base, power = map(int, input().split())
        print(get_digit(base, power), end="1")
        print()
        t -= 1


main()
