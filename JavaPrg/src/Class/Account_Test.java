//클래스 좀 더 연습해오겠습니다....
package Class;
class Account1 {
	private String acc_num;
	private int balance;
	
	Account1(){
		
	}
	Account1(String acc_num, int balance){
		this.acc_num = acc_num;
		this.balance = balance;
	}
	public void deposit(int depositAmount) {
		this.balance += depositAmount;
	}
	public void withdraw(int withdrawAmount) {
		if(this.balance >= withdrawAmount) {
			this.balance -= withdrawAmount;
		}else {
			System.out.println("잔액이 부족합니다.");
		}
	}
	public void printMyAccount() {
		System.out.println("==============");
		System.out.println("계좌번호 : " + this.acc_num);
		System.out.println("잔    액 : " + this.balance);
	}
	public String toString() {
		return "계좌번호 : " + acc_num + ", 현재잔액 : " + balance+"원";
	}
	
}
public class Account_Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account1 ac1 = new Account1("7777-01-6087207", 12000);
		System.out.println(ac1.toString());
		Account1 ac2 = new Account1("10-02-33-1457", 32000);
		System.out.println(ac2.toString());
		
		ac1.deposit(12000);
		ac2.withdraw(10000);
		ac1.printMyAccount();
		ac2.printMyAccount();
	}

}
