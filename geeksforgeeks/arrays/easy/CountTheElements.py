def get_greatest_smallest(a, low, high, target):
    result = -1
    while low <= high:
        mid = (low + high) // 2
        if a[mid] <= target:
            result = mid
            low = mid + 1
        else:
            high = mid - 1
    return result


def get_count(a, target):
    result = get_greatest_smallest(a, 0, len(a) - 1, target) + 1
    return result


def main():
    t = int(input())
    while t > 0:
        n = int(input())
        a = [int(i) for i in input().split()]
        b = [int(i) for i in input().split()]
        b.sort()
        q = int(input())
        while q > 0:
            target = int(input())
            print(get_count(b, a[target]))
            q -= 1
        t -= 1


main()