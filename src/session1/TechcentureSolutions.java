package session1;

public class TechcentureSolutions extends ExpenseTracker {

	
	public TechcentureSolutions(String userName, String password, double initialBalance, double initialExpense) {
		super(userName, password, initialBalance, initialExpense);
	
	}

	@Override
	public void showAccount() {
	
		//provide business solutions to showAccount
		System.out.println("showing account for user");
	}

	@Override
	public void login(String username, String password) {
		if (!username.isEmpty() && !password.isBlank()) {
			System.out.println("Login successful");
		}else {
			System.out.println("Somethign went wrong");
		}
	}

	@Override
	public void shareExpense(String friend, double percentage) {
	
		System.out.println("Sharing expsense with " + friend + 
				" at " + percentage);
	}

	@Override
	public void displaySpending(double amount) {
		
		System.out.println("You have spent $ " + amount);
	}

	@Override
	public void showOverAllSpending(String basis) {
		
		System.out.println("For this " + basis + " you have spent: $");
	}

	
	
}
