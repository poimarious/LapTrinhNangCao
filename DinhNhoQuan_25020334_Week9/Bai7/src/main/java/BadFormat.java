public class BadFormat{
    int wrong_Name=10; // Sai tên biến, thiếu khoảng trắng
    public void DoSomething () { // Thụt lề sai, sai tên phương thức
        if(wrong_Name==10)System.out.println("Lỗi Checkstyle");
    }
}