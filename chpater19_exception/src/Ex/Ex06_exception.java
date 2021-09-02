package Ex;

class BankAccount{
	
	private String no;
	private long balance;
	
	public BankAccount(String no, long balance) {
		this.no = no;
		this.balance = balance;
	}
	
	public void deposit(long money) throws DepositException {
		if(money <0) {
			throw new DepositException(1000, "0보다 작으면 입금 불가");
		}
		balance += money;
	}
	
	public void withdraw(long money) throws WithdrawException{
		if (money > balance) {
			throw new WithdrawException(2000,"잔액보다 크면 출금 불가");
		} else if (money<0) {
			throw new WithdrawException(2001, "0보다 작으면 출금 불가");
		}
		balance -= money;
	}
	
	public void inquiry() {
		System.out.println("계좌번호 :"+no);
		System.out.println("계좌잔액 :"+balance);
	}
	
	public void transfer(BankAccount account, long money) throws DepositException, WithdrawException {
		withdraw(money);
		account.deposit(money);
	}
}

class DepositException extends Exception{
	private static final long serialVersionUID = 1L;
	private int errCode;
	
	public DepositException(int errCode, String message) {
		super(message);
		this.errCode = errCode;
	}
	
	public int getErrCode() {
		return errCode;
	}
}

class  WithdrawException extends Exception{ 
	private static final long serialVersionUID = 1L;
	private int errCode;
	
	public WithdrawException(int errCode, String message) {
		super(message);
		this.errCode = errCode;
	}
	
	public int getErrCode() {
		return errCode;
	}
}


public class Ex06_exception {
	public static void main(String[] args) {

		BankAccount acc1 = new BankAccount("1", 1000);
		
	}
}
