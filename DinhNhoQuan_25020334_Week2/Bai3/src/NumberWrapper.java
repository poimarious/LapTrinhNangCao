public class NumberWrapper {
	private int value;

	public NumberWrapper(int v) {
		this.value = v;
	}

	public void setValue(int Value) {
		this.value = Value;
	}
	public void getValue() {
		System.out.println("Value:" + this.value);
	}
}