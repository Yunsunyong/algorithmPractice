package al.pratice;

public class Algorithm1 {

	public static void multi() {
		System.out.print("    | ");
		for(int i = 1; i <= 9;i++) {
			System.out.printf("%3d",i);
		}
		System.out.println("\n---+---------------------------");
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%2d | ",i);
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%3d", i*j);
			}
			System.out.println();
		}
	}
	public static void sum() {
		System.out.print("    | ");
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%3d",i);
		}
		System.out.println("\n---+--------------------------------");
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%2d | ",i);
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%3d",i+j);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		//2018-12-14 (금)
		//multi();
		sum();
	}

}
