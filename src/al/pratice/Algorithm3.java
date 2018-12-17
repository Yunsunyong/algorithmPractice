package al.pratice;

import java.util.Scanner;

public class Algorithm3 {
	private static Scanner sc = new Scanner(System.in);
	
	public static void spira(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j < n - i +1; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= (i -1)*2 +1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void npira(int n) {
		for (int i = 1; i <= n; i++) { 					
			for (int j = 1; j < n - i + 1; j++) 		
				System.out.print(" ");
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) 	
				System.out.print(i % 10);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		//2018-12-19 (화)
		System.out.print("n단 입력 : ");
		//spira(sc.nextInt()); //n단의 별 피라미드
		npira(sc.nextInt()); //n단의 숫자 피라미드
	}
}
