

````Text
Ở Code cũ, khi ta chọn các test case ngay tại biên 5.0, 6.5
5.0: 
Expected: Trung bình
Actual: Yếu

6.5:
Expected: Khá
Actual: Trung bình

lý do: 
Việc sử dụng phép so sánh <= ở đó đã khiến cho code sai logic

Giải pháp: đổi <= thành <