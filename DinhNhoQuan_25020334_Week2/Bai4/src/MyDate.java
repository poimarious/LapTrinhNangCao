public class MyDate {
	private int day;
	private int month;
	private int year;

	public MyDate(int d, int m, int y) {
		this.day = d;
		this.month = m;
		this.year = y;
	}

	public MyDate(MyDate d) {
		this.day = d.day;
		this.month = d.month;
		this.year = d.year;
	}

	public void getDate() {
		System.out.println(this.day + "/" + this.month + "/" + this.year);
	}

	public void setDate(int d, int m, int y) {
		this.day = d;
		this.month = m;
		this.year = y;
	}

}