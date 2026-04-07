public class Object {
	private String id;
	private String state;
	private String behavior;
	public Object(String i, String s, String b) {
		this.id = i;
		this.state = s;
		this.behavior = b;
	}
	public void ShowInfo() {
		System.out.println("Dinh danh:" + id);
		System.out.println("Trang thai:" + state);
		System.out.println("Hanh vi:" + behavior);
	}
}