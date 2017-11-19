#!/bin/python3
A = list(map(int, input().strip().split()))
B = list(map(int, input().strip().split()))

Ascore = len([1 for a,b in zip(A,B) if a>b])
Bscore = len([1 for a,b in zip(A,B) if b>a])
print (Ascore, Bscore)