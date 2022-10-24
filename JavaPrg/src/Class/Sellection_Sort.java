package Array;
import java.util.Scanner;
public class Sellection_Sort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int tmp;
		for(int i = 0; i <= arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			System.out.print(arr[i]+" ");
		}
	}

}
