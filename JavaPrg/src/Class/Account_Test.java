package Class;

class Account {
	private String A_name;
	int A_amount;
	Account(String name, int amount){
		//A_name = name;
		setOwnName(name);
		A_amount = amount;
	}
	String ret_name(){
		return A_name;
	}
	void setOwnName(String name){
		A_name = name;
	}
}
public class Account_Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acct = new Account("홍길동", 3000);
		System.out.println(acct.ret_name());
		System.out.println(acct.A_amount); //private 직접 접근 없이 return
	}

}
