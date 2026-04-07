public class Transaction {
	private final String transactionid, amount, timestamp;
	
	public Transaction(String transactionid, String amount, String timestamp) {
		this.transactionid = transactionid;
		this.amount = amount;
		this.timestamp = timestamp;
	}

	public Transaction(Transaction t) {
		this.transactionid = t.transactionid;
		this.amount = t.amount;
		this.timestamp = t.timestamp;
	}

	public String getAmount() {return amount;}
	public String toString() {
		return String.format("ID: %s | Amount: %s | Time: %s", transactionid, amount, timestamp);
	}
}