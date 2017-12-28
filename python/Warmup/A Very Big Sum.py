#!/bin/python3

import sys

def aVeryBigSum(n, ar):
    # Comp0lete this function
    return sum(ar)

n = int(input().strip())
ar = list(map(int, input().strip().split(' ')))
result = aVeryBigSum(n, ar)
print(result)