```Text
các lớp tương đương cho tham số price:
1: price < 0
2: 0 <= price < 100
3: price >= 100

bảng testcase: testcase.xlsx

BVA cho tham số price:
biên 0:
min- (-0.01): IllegalArgumentException
min(0): hợp lệ
min+ (0.01): hợp lệ

biên 100:
max-(99.99)
max(100)
max+(100.01)


