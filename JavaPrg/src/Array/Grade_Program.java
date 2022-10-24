package Array;
import java.util.Scanner;
public class Grade_Program {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String[] subj_name = new String[] {"국어", "영어", "수학", "자바", "C", "일본어", "기술가정"};
		
		System.out.print("몇 명 입력하시겠습니까? : ");
		int n = sc.nextInt();
		System.out.print("몇 과목을 입력하시겠습니까? : ");
		int subj = sc.nextInt();
		
		int[][] score = new int[n][subj + 1];
		String[] clas = new String[n];
		String[] name = new String[n];
		double[] avg = new double[n];
		char[] grade = new char[n];
		int[] rank = new int[n];
		
		// 입력
		for(int i = 0; i < n; i++) {
			System.out.println((i+1)+"번째 학생의 데이터 입력");
			System.out.print("학번 : ");
			clas[i] = sc.next();
			System.out.print("이름 : ");
			name[i] = sc.next();
			
			for(int j = 0; j < score[i].length-1; j++) {
				do {
					System.out.print(subj_name[j]+" : ");
					score[i][j] = sc.nextInt();
				}
				while(score[i][j]<0 || score[i][j] > 100);
				score[i][subj] += score[i][j];
			}
			
			avg[i] = (double)score[i][subj]/(score[i].length-1);
			
			switch((int)avg[i]/10) {
			case 10 : case 9 :
				grade[i] = 'A';
				break;
			case 8 :
				grade[i] = 'B';
				break;
			case 7 :
				grade[i] = 'C';
				break;
			case 6 :
				grade[i] = 'D';
				break;
			default :
				grade[i] = 'E';
				break;
			}
		}
		
		//석차 
		for(int i = 0; i < n; i++) {
			rank[i] = 1;
		}
		 for (int i = 0; i < n-1; i++) {
	         for (int j = i+1; j < n; j++) {
	            if (score[i][subj] < score[j][subj]) {
	               rank[i]++;
	            } else {
	               rank[j]++;
	            }
	         }
	      }
		
		// 출력
		for(int i = 0; i < n; i++) {
			System.out.printf("%s %s ", clas[i], name[i]);
			for(int k = 0; k < subj; k++) {
				System.out.print(score[i][k] + " ");
			}
			System.out.printf("%d %.1f %c %d", score[i][subj], avg[i], grade[i], rank[i]);
			System.out.println();
			
		}
	}
}
