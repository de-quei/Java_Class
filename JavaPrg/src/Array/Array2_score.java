package Array;
import java.util.Scanner;
public class Array2_score {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int[][] score = new int[5][3]; //성적 입력 후 저장하는 배열
		int[] arr = new int[5]; //합산 값을 넣는 배열
		int max = 0, max_team = 0;
		
		System.out.println("     완성도 창의성 이해도");
		for(int i = 0; i < score.length; i++) {
			System.out.print((i+1) + "조 : ");
			for(int j = 0; j < score[i].length; j++) {
				do {
				score[i][j] = sc.nextInt();
				}
				while(score[i][j] < 0 || score[i][j] > 20);
				arr[i] += score[i][j]; // 각 조의 점수를 합산
			}
			if(arr[i] > max) {// 최고점수 max
				max = arr[i];
				max_team = i+1;
			}
		}
		System.out.print("최고팀 : " + max_team + "번째 팀" + " -> 점수 : "+max);
		
	}

}