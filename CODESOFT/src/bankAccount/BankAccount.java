package bankAccount;

public class BankAccount {
	private double bal;
	public BankAccount(double iniBal) {
		if(iniBal>=0) {
			this.bal=iniBal;
		}
		else {
			this.bal=0;
		}
	}
	
	public double getBal(){
		return bal;
	}
	
	public void deposit(double amt) {
		if(amt>0) {
			bal+=amt;
		}
	}
	
	public boolean withdraw(double amt) {
		if(amt>0 && amt<=bal) {
			bal-=amt;
			return true;
		}
		return false;
	}
}
