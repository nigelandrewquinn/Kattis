m, a, b, c = map(int, input().split())
print('possible' if max(a, b, c) <= m and a + b + c <= 2 * m else 'impossible')