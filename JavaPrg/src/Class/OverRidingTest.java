package Class;

class A{
	String name = "class A";
	void show() {
		System.out.println("이름 : "+name);
	}
}
class B extends A{
	void show() {
		System.out.println("overriding");
		System.out.println("이름이 나올까요? : "+name);
	}
}
public class OverRidingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		B b = new B();
		a.show();
		b.show();
}

}