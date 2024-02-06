package assignment;

class InsufficientBalanceException extends Exception {
    private int requiredAmount;

    public InsufficientBalanceException(int requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    public int getRequiredAmount() {
        return requiredAmount;
    }

    @Override
    public String getMessage() {
        return "Sorry, insufficient balance. You need more " + requiredAmount + " Rs. to perform this transaction.";
    }
}

class Account {
    private int balance;

    public Account(int initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(int amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(amount - balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance + " Rs.");
        }
    }

public class Demo33 
{
	    public static void main(String[] args) 
	    {
	        Account account = new Account(2000);

	        System.out.print("Account balance is: " + account.getBalance() + " Rs.\nEnter withdraw amount: ");
	        int withdrawAmount = 2500;

	        try {
	            account.withdraw(withdrawAmount);
	        } 
	        catch (InsufficientBalanceException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}

}
