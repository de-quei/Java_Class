package Class;

class Test{
	void show(String str) {
		System.out.println("매개변수 전달됨 : " + str);
	}
	void show() {
		System.out.println("overriding");
	}
}
public class OverLoadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = new Test();
		t1.show();
		t1.show("mirim");
		
	}

}