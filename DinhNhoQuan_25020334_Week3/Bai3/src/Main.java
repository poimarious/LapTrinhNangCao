public class Main {
	public static void main(String[] args) {
		MathUtils m = new AdvancedMath();
		System.out.println(m.sum(5, 5));
		/*
		output: 20
		lý do: m được khai báo với kiểu MathUtils nhưng lại tạo ra bằng đối tượng AdvancedMath -> java sẽ ưu tiên hàm sum()
		được ghi đè trong lớp con AdvancedMath
		*/
		//System.out.println(m.sum(5.5, 5.5));

		/*
		error: incompatible types: possible lossy conversion from double to int
		Lý do: m mặc dù tạo ra bằng đối tượng AdvancedMath, nhưng vẫn mang kiểu dữ liệu MathUtils. mà trong lớp MathUtils 
		chỉ có hàm sum nhận int, không có hàm nhận double.
		*/
	}
 }
