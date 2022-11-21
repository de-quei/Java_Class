package Class;
import java.util.Scanner;
class Point{
	double x;
	double y;
	Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	void Position(){
		System.out.println("("+this.x+", "+this.y+")");
	}
	void Move(double M_x, double M_y) {
		this.x = this.x + M_x;
		this.y = this.y + M_y;
	}
}
public class MakePointEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Point[] po = new Point[2];
		
		for(int i =0; i < po.length; i++) {
			System.out.print("x, y 좌표 입력(실수) : ");
			po[i] = new Point(sc.nextDouble(), sc.nextDouble());
			po[i].Position();
		}
		
		for(int i = 0; i < po.length; i++) {
			System.out.print("이동 거리 입력(x거리, y의 거리) : ");
			po[i].Move(sc.nextDouble(), sc.nextDouble());
			po[i].Position();
		}
		
	}
	
}
