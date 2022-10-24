package Class;
import java.util.Scanner;
class Box{
	int width;
	int height;
	int depth;
	int calc_vol(){
		return width * height * depth;
	}
	Box(){
		
	}
	Box(int w, int h, int d){
		width = w;
		height = h;
		depth = d;
	}
}
public class TwoBox {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Box box1 = new Box(3, 4, 5);//생성자
		Box box3 = new Box(1, 2, 3);
		//box1.width = sc.nextInt();
		//box1.height = sc.nextInt();
		//box1.depth = sc.nextInt();
		
		Box box2 = new Box(1, 2, 3);
		//box2.width = sc.nextInt();
		//box2.height = sc.nextInt();
		//box2.depth = sc.nextInt();
		
		System.out.println("박스1의 부피 : " + box1.calc_vol());
		System.out.println("박스2의 부피 : " + box2.calc_vol());
	}
}
