package al.pratice;

import java.util.Scanner;

public class Algorithm2 {
	private static Scanner sc = new Scanner(System.in);
	public static void triangle() {
		System.out.print("단수 : ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void triangleLB(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
	}
	public static void triangleLU(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = n; j > i; j--) {
				System.out.print("*  ");
			}
			System.out.println();
		}
	}
	public static void triangleRU(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(j < i? " " : "*");
			}
			System.out.println();
		}
	}
	public static void triangleRB(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= n; j++) {
				System.out.print(j < (n-i)? " " : "*");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		// 2018-12-17 (월)
		triangle();   //정사각형
		System.out.print("숫자 입력 : ");
		int n = sc.nextInt();
		triangleLB(n);   //왼쪽아래 직각삼각형
		triangleLU(n);   //왼쪽위 직각삼각형
		triangleRU(n);   //오른쪽위 직각삼각형
		triangleRB(n);      //오른쪽아래 직각삼각형
	}

}
