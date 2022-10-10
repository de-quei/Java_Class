package Project_2022;

import java.util.HashMap;
import java.util.Scanner;
 
class LoginProgram {
    private String id;
    private String password;
    static boolean LoginFlag = false;
    HashMap<String,String> memberTable = new HashMap<String,String>();//DB대신..
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
    //메뉴 출력 메소드
    public char display() {
    	System.out.println();
    	System.out.println("     < 메뉴 선택>");
    	System.out.println();
    	System.out.println("     1. 서비스 안내");
    	System.out.println("     2. 서비스 시작");
    	System.out.println("     3. 회원가입");
    	System.out.println("     4. 로그인");
    	System.out.println("     5. 로그아웃");
    	System.out.println("     6. 지역 별 문의처 전화번호");
    	System.out.println("     7. 종료");
    	System.out.print("     >>>");
    	return input().charAt(0);
    }
    
    
    //입력 메소드
    public String input() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    
    //회원가입 메소드
    public void Join() {
        if (LoginFlag) {
            System.out.println("     자동로그아웃하고 새로운 회원가입을 시작합니다.");
            LoginFlag = false;
        }
        while(true) {
            System.out.print("     가입 id : ");
            String newId = input();
            if(memberTable.containsKey(newId)) {
                System.out.println("     이미 존재하는 아이디 입니다.");
                continue;
            }
            System.out.print("     가입 pw : ");
            String newPwd = input();
            memberTable.put(newId, newPwd);
            break;
        }
        System.out.println("     저장 완료");
    }
    //로그인 메소드
    public void LoginVaild() {
        if (LoginFlag) {
            System.out.println("     이미 로그인되어 있는 상태입니다.");
            return;
        }
    }    
        
        
    public void MemberCheck(String id, String pw) {    
        if (memberTable.containsKey(id)) {
            if (!memberTable.get(id).equals(pw)) {
                System.out.println("     비밀번호가 맞지 않습니다. 인증 실패");
            } else {
                System.out.println("     인증 성공");
                LoginFlag = true;
            }
        } else {
            System.out.println("     존재하지 않는 아이디 입니다.");
        }
    }
    
    //로그아웃 메소드
    public void logout() {
        if (!LoginFlag) {
            System.out.println("     먼저 사용자 로그인이 필요합니다.");
            return;
        }
        System.out.println("     로그아웃 합니다.");
        LoginFlag = false;
    }
}
public class EungAe_EungAe{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		LoginProgram Program = new LoginProgram();
		
		System.out.println();
		System.out.println("        UU  UU                          AAAAA          ");
		System.out.println("EEEEE   UU  UU   NN   NN               AA   AA    EEEEE");
		System.out.println("EE      UU  UU   NNN  NN   GGGGGG      AAAAAAA    EE   ");
		System.out.println("EEEEE   UU  UU   NN N NN   GG      ★   AA   AA    EEEEE");
		System.out.println("EE       UUUU    NN  NNN   GG GGG      AA   AA    EE   ");
		System.out.println("EEEEE            NN   NN   GG  GG                 EEEEE");
		System.out.println("                           GGGGGG                      ");
		
		System.out.println();
		System.out.println("           EEEEE                      GGGGGG                      ");
		System.out.println("           EE      UU  UU             GG                     EEEEE");
		System.out.println("           EEEEE   UU  UU   NN   NN   GG GGG   ★   AAAAA     EE   ");
		System.out.println("           EE      UU  UU   NNN  NN   GG  GG      AA   AA    EEEEE");
		System.out.println("           EEEEE   UU  UU   NN N NN   GGGGGG      AAAAAAA    EE   ");
		System.out.println("                    UUUU    NN  NNN               AA   AA    EEEEE");
		System.out.println("                            NN   NN               AA   AA         ");
		
		while(true) {
			char select = Program.display();
			
			switch(select) {
			case '1':
				System.out.println("    --------------------------------------------------------------------------------");
				System.out.println("    ㅣ <응애응애>는 임신/출산/육아 생애 주기 별, 필요한 의료/경제/사회복지 서비스를 안내해주는 서비스입니다. ㅣ");
				System.out.println("    --------------------------------------------------------------------------------");
				break;
			case '2':
				System.out.println("    현재 생애 주기를 선택하여 주십시오.");
				System.out.println("    1. 임신 / 2. 출산 / 3. 육아");
				System.out.print("    >>>");
				int Menu_num1 = sc.nextInt();
				System.out.println("    필요한 서비스의 분야를 선택하여 주십시오.");
				System.out.println("    1. 경제 / 2. 의료 / 3. 사회복지");
				System.out.print("    >>>");
				int Menu_num2 = sc.nextInt();
				
				switch(Menu_num1) {
				case 1 :
					if(Menu_num2 == 1) {
						System.out.println("    1) 임신 및 출산 의료비 지원");
						System.out.println("    - 임신 바우처 60만원 -> 100만원 인상");
						System.out.println("    - 다자녀 : 140만원 / 청소년 산모 : 120만원 지원 가능");
					}
				case 2 :
				case 3 :
				}
				
			case '3':
				Program.Join();
				break;
			case '4':
				Program.LoginVaild();
				if(LoginProgram.LoginFlag) {
					break;
				}
				System.out.print("     아이디 입력 : ");
				String myId = sc.nextLine();
				Program.setId(myId);
				System.out.print("     비밀번호 입력 : ");
				String myPw = sc.nextLine();
				Program.setPassword(myPw);
				Program.MemberCheck(Program.getId(), Program.getPassword());
				break;
			case '5' :
				Program.logout();
			case '6':
			case '7' :
				System.exit(0);
			}
			
		}
			
	}
}

	
