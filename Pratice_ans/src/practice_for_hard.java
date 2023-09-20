import java.util.Scanner;

public class practice_for_hard {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("자연수 하나를 입력하세요 : ");
		int num = scan.nextInt();
		int count =0;
		
		//2와 3의 배수를 모두 출력
		for(int i = 1; i<=num; i++) { //1부터 입력받은 수 까지 반복해서 2와 3의 배수를 출력 
			if(i%2 ==0 || i%3 ==0) { //만약 2또는 3으로 나눠지면 배수입니다.
				System.out.print(i + " "); // 2와 3의 배수 출력
			}
			
		}
		for(int i = 1; i<=num; i++) {
			if(i%2==0 && i%3 ==0) {// 2로 나눠지면서 3으로도 나눠진다면(공배수)
				count ++; //개수를 셉니다.
				
			}
		}
		System.out.println(); //줄바꿈
		System.out.println("count : "+ count); //공배수 개수 출력
	}
}



