package Array;
import java.util.Scanner;
public class Grade_Program {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String clas, name;
		double avg;
		char grade;
		
		String[] subj_name = new String[] {"국어", "영어", "수학", "자바", "C", "일본어", "기술가정"};
		
		System.out.print("몇 명 입력하시겠습니까? : ");
		int n = sc.nextInt();
		System.out.print("몇 과목을 입력하시겠습니까? : ");
		int subj = sc.nextInt();
		
		int[] score = new int[subj+1];
		
		for(int i = 1; i <= n; i++) {
			System.out.println(i+"번째 학생의 데이터 입력");
			System.out.print("학번 : ");
			clas = sc.next();
			System.out.print("이름 : ");
			name = sc.next();
			
			for(int j = 0; j < score.length; j++) {
				do {
					System.out.print(subj_name[j]+" : ");
					score[j] = sc.nextInt();
				}
				while(score[j]<0 || score[j] > 100);
				score[subj] += score[j];
			}
			avg = (double)score[subj]/(score.length);
			
			switch((int)avg/10) {
			case 10 : case 9 :
				grade = 'A';
				break;
			case 8 :
				grade = 'B';
				break;
			case 7 :
				grade = 'C';
				break;
			case 6 :
				grade = 'D';
				break;
			default :
				grade = 'E';
				break;
					
			}
			System.out.printf("%s %s", clas, name);
			for(int k = 0; k <score.length; k++) {
				
			}
			System.out.printf("");
		}

	}

}