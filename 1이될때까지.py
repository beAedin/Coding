cnt = 0
n, k = map(int, input().split())
# First parameter : original num
# Second parameter : repeat count

# 1. N - 1
# 2. N / K ---> if N % K = 0

# Solution 1
while n > 1:
    cnt += 1
    if n%k == 0 :
        n /= k
        continue
    n -= 1

print(cnt)


# Solution 2
# The case of many numbers
# subtract K at once

n, k = map(int, input().split())
cnt = 0

while True:
    # Minus until N % K = 0
    target = (n//k)*k
    cnt += (n-target)
    n = target

    # N < K (= no more -> escape)
    if n < k :
        break

    # N/K
    cnt += 1
    n //= k

cnt += (n-1)
print(cnt)