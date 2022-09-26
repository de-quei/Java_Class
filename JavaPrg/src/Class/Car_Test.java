package Class;

class Car{ //멤버 변수 / 멤버 메소드
	String model_name; 
	String company; 
	void SpeedUp() {
		System.out.println(model_name + " 이(가) 속도를 올립니다.");
	}
	void Stop() {
		System.out.println(model_name + " 이(가) 정지합니다.");
	}
}

public class Car_Test { //이 친구도 클래스이기 때문에 메인과 클래스 밖에서 작성해야 함
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car khw = new Car(); //김현우의 클래스
		khw.model_name = "모닝";
		khw.company = "현대";
		khw.SpeedUp();
		khw.Stop();
		
		Car mjl = new Car(); //민주리쌤의 클래스
		mjl.model_name = "그랜저";
		mjl.company = "현대";
		mjl.SpeedUp();
		mjl.Stop();
	}
}
// 객체 사용 이유 : 모듈화!, 재사용 가능 -> 생산성이 높아진다.