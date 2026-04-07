public class Main {
	public static void main(String[] args) {
		Person p = new Person("Poi");
		p.setMe(p);
		System.out.println(p.getMe().getName());	
		p = null;
		System.out.println(p.getMe().getName());	
	}
}


/*
Sau khi setMe(p), chỉ có 1 đối tượng Person tồn tại trong Heap.
Sau khi p = null, đối tượng Person sẽ vẫn chưa bị xóa ngay. vì khi đó con trỏ me vẫn đang trỏ tới Person.
đối tượng này sẽ được xóa trong lần duyệt tiếp theo của GC.
Đối tượng không thể truy cập lại vì khi đó không còn con trỏ nào trỏ vào nó nữa. 
*/