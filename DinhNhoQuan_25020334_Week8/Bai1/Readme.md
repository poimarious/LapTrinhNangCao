```Text
Đoạn 1:
Code smell:
-Mysterious name and magic number: khi đặt tên biến f, m,... và sử dụng con số 0.9 thay vì sử dụng một constant cụ thể sẽ gây khó hiểu cho người đọc code và việc phát triển sau này.
Kỹ thuật refactor: replace magic number with constant
thay biến f thành fee, biến m thành isMember, biến h thành hours, biến r thành rate, biến t thành type.
thay 0.9 thành biến final.

Đoạn 2:
Code smell:
Vi phạm nguyên tắc SRP
bên trong class UserService đang chứa quá nhiều method
Kỹ thuật refactor: extract class
chỉ giữ lại trong UserService phương thức userById().
Tạo class EmailService, bên trong có các phương thức sendWelcomeEmail() và sendPasswordResetEmail()
Tạo class UserPresenter, bên trong có phương thức renderUserProfile()
Tạo class UserExporter, bên trong có exportUserToCsv()

Đoạn 3:
Code smell:
vi phạm nguyên tắc OCP
mỗi khi có thêm một hình mới, ta sẽ phải viết thêm câu lệnh if bên trong hàm getArea()
Kỹ thuật refactor: replace conditional with polymorphism
Tạo interface Shape, có method getArea(). Tạo các class Rectangle, Circle, Triangle implements Shape.
Và ghi đè phương thức getArea()

Đoạn 4:
Code smell:
class Report đang chứa quá nhiều attributes một cách rời rạc
Kỹ thuật refactor: extract class
tạo class Author, bên trong có chứa các biến name, email, phone, address
trong class Report sẽ chứa String title, String content và Author author