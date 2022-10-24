package Class;
class Box{
	int width;
	int height;
	int depth;
	void calc_vol(){
		int volume = width * height * depth;
		System.out.println("박스의 부피 : " + volume);
	}
}
public class TwoBox {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box1 = new Box();
		box1.width = 5;
		box1.height = 4;
		box1.depth = 7;
		
		Box box2 = new Box();
		box2.width = 3;
		box2.height = 5;
		box2.depth = 9;
		
		box1.calc_vol();
		box2.calc_vol();
	}
}
