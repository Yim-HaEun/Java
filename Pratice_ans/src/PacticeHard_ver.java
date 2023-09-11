import java.util.Scanner;

public class PacticeHard_ver {

	public static void main(String[] args) {
		// 정수를 입력받고 별을 증가시키며 출력하세요.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = scan.nextInt();// num에 정수를 입력받는다.
		
		//반복문을 사용해 별(*)을 증가시키며 출력
		for(int i = 1; i<=num; i++) {
			for(int a = num; a>=i;a--) {
				System.out.print(" ");
			}
			for(int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			for(int k =2; k <=i; k++) {
				System.out.print("*");
			}
			System.out.println("");//줄바꿈
		}

	}
}


