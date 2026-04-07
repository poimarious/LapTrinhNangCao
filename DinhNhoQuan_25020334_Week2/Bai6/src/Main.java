public class Main {
	public static void main(String[] args) {
		Account Poi = new Account("Poi3105", 40000);
		Poi.addTransaction(new Transaction("T1", "100", "08:57"));

		System.out.println(Poi.getHistory()[0]);

		Transaction[] newHis = Poi.getHistory();
		newHis[0] = null;
		System.out.println(newHis[0]);
		System.out.println(Poi.getHistory()[0]);
	}
}