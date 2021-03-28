package session1;

public class GoogleSolitions extends ExpenseTracker{

	
	public GoogleSolitions(String userName, String password, double initialBalance, double initialExpense) {
		super(userName, password, initialBalance, initialExpense);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showAccount() {
		System.out.println("Amazing solution here from Google");
		
	}

	@Override
	public void login(String username, String password) {
		System.out.println("Amazing solution here from Google");
		
	}

	@Override
	public void shareExpense(String friend, double percentage) {
		System.out.println("Amazing solution here from Google");
		
	}

	@Override
	public void displaySpending(double amount) {
		System.out.println("Amazing solution here");
	}

	@Override
	public void showOverAllSpending(String basis) {
		System.out.println("Amazing solution here from Google");
	}

	
	
}
