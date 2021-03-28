package session1;

public class Main {

	
	
	public static void main(String[] args) {
		
	
		/*
		 * With the same reference of ExpenseTracker, we are able to create multiple
		 * instances of concrete classes which implement our ExpenseTracker abstract class
		 * 
		 * Polymorphism - poly means more than one, morph means forms. In java Polymorphism,
		 * means objects being able to take multiple forms. In this example, ExpenseTracker is just
		 * an abstract classes with abstract methods. There are 3 concrete classes which extend
		 * from ExpenseTracker: TechcentureSolutions, WiproSolutions and GoogleSolutions. All of these
		 * 3 classes implement ExpenseTracker's abstract methods such as displaySpending, 
		 * showOverAllSpending, shareExpense and so on. Polymorphism states that with the same reference of
		 * ExpenseTracker we are able to create any of the 3 subclasses of ExpenseTracker and we are 
		 * also able to switch between them if we like. 
		 * 
		 * 
		 */
		
		
		System.out.println("----techcenture soltuions implementiaons-----");
		ExpenseTracker expenseTracker = new TechcentureSolutions("Golib", "123Pass", 
				1000, 50.50);

		expenseTracker.login("Golib", "pass");
		expenseTracker.displaySpending(53454);
		expenseTracker.showOverAllSpending("daily");
		expenseTracker.shareExpense("Harry", 25);
		
		System.out.println("-----Wipro SOlutions Implementations-----");
		
		expenseTracker = new WiproSolutions("Golib", "123Pass", 1000, 50.50);

		expenseTracker.login("Golib", "pass");
		expenseTracker.displaySpending(53454);
		expenseTracker.showOverAllSpending("daily");
		expenseTracker.shareExpense("Harry", 25);
		
		
		System.out.println("-----Google SOlutions Implementations-----");
		expenseTracker = new GoogleSolitions("Golib", "123Pass", 1000, 50.50);

		expenseTracker.login("Golib", "pass");
		expenseTracker.displaySpending(53454);
		expenseTracker.showOverAllSpending("daily");
		expenseTracker.shareExpense("Harry", 25);
		
		
//		expenseTracker = new VerizonSolutions();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
