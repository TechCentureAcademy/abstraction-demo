package session1;

public abstract class ExpenseTracker {

	private String userName;
	private String password;
	private double initialBalance;
	private double initialExpense;
	
	
	public ExpenseTracker(String userName, String password, double initialBalance, double initialExpense) {
		super();
		this.userName = userName;
		this.password = password;
		this.initialBalance = initialBalance;
		this.initialExpense = initialExpense;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public double getInitialBalance() {
		return initialBalance;
	}

	public void setInitialBalance(double initialBalance) {
		this.initialBalance = initialBalance;
	}

	public double getInitialExpense() {
		return initialExpense;
	}
	public void setInitialExpense(double initialExpense) {
		this.initialExpense = initialExpense;
	}


	public abstract void showAccount();
	public abstract void login(String username, String password);
	public abstract void shareExpense (String friend, double percentage);
	public abstract void displaySpending(double amount);
	public abstract void showOverAllSpending(String basis);
	
	public void showUser(String user) {
		System.out.println("Logged in user: " + user);
	}
	
	public void logout() {
		System.out.println("Goodbye!");
	}
}
