package al.pratice;

import java.util.Arrays;

public class Algorithm4 {

	public static int[] arrayTest1() {
		int[] iar = {5,10,73,2,-5,42};
		
		int tmp = iar[0];
		iar[0] = iar[5];
		iar[5] = tmp;
		
		for(int i = 0; i < iar.length; i++) {		
			System.out.print(iar[i] + " ");
		}
		System.out.println();
		return iar;
	}
	
	public static int[] arrayTest2(int[] iar) {
		
		int tmp = iar[1];
		iar[1] = iar[4];
		iar[4] = tmp;
		
		for(int i = 0; i < iar.length; i++) {
			System.out.print(iar[i] + " ");
		}
		System.out.println();
		return iar;
	}
	public static int[] arrayTest3(int[] iar) {
		int tmp = iar[2];
		iar[2] = iar[3];
		iar[3] = tmp;
		
		for(int i = 0; i < iar.length; i++) {
			System.out.print(iar[i] + " ");
		}
		System.out.println();
		return iar;
	}
	public static void arrayTest4() {
		int[] iar = {5,10,73,2,-5,42};
		
		for(int i = 0; i < iar.length; i++) {
			for(int j = i + 1; j < iar.length;j++) {	
				int tmp = iar[i];
				iar[i] = iar[j];
				iar[j] = tmp;
			}
		}
		for(int i = 0; i < iar.length; i++) {
			System.out.print(iar[i] + " ");
		}
	}
	public static void sumOf(int[] iar) {
		int sum = 0;
		for(int i =0; i < iar.length; i++) {
			sum += iar[i];
		}
		System.out.println("\n배열 합계 : " + sum);
	}
	
	public static void main(String[] args) {
		// 알고리즘4번째
		int[] iar = arrayTest1();
		int[] iar1 = arrayTest2(iar);
		int[] iar2 = arrayTest3(iar1);
		arrayTest4();
		sumOf(iar);
	}

}
