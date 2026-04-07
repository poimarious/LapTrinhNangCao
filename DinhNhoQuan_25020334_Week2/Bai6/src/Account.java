public class Account {
	private String accountId;
	private double balance;
	private Transaction[] history;

	private int count = 0;

	public Account(String accountId, double balance) {
		this.accountId = accountId;
		this.balance = balance;
		this.history = new Transaction[1001];
	}

	public boolean addTransaction(Transaction t) {
		if(count < history.length) {
			history[count++] = t;
			return true;
		}
		else return false;
	}

	public Transaction[] getHistory() {
		Transaction[] newHis = new Transaction[this.history.length];
		for(int i = 0; i < newHis.length; i++) {
			if(this.history[i] == null) break;
			newHis[i] = new Transaction(this.history[i]);
		}
		return newHis;
	}
}