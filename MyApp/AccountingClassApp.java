class Accounting{
	public static double valueOfSupply;
	public static double vatRate;
	public static double expenseRate;
	
	static void print() {
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + getVAT() );
		System.out.println("Total : " + getTotal() );
		System.out.println("Expense : " + getExpense() );
		System.out.println("Income : " + getIncome() );
		System.out.println("Dividend :" + getDividend1());
		System.out.println("Dividend :" + getDividend2());
		System.out.println("Dividend :" + getDividend3());
	}

	private static double getDividend1() {
		return getIncome() * 0.5;
	}
	
	private static double getDividend2() {
		return getIncome() * 0.3;
	}
	
	private static double getDividend3() {
		return getIncome() * 0.2;
	}

	private static double getIncome() {
		return valueOfSupply - getExpense();
	}

	private static double getExpense() {
		return valueOfSupply * expenseRate;
	}

	private static double getTotal() {
		return valueOfSupply + getVAT();
	}

	private static double getVAT() {
		return valueOfSupply * vatRate;
	}
}

public class AccountingClassApp {

	public static void main(String[] args) {
		Accounting.valueOfSupply = 10000.0;
		Accounting.vatRate = 0.1;
		Accounting.expenseRate = 0.3;
		Accounting.print();
	}

}
