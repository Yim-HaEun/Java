package Practice_ifSwitch;
import java.util.Scanner;
public class practice2 {

	public static void main(String[] args) {
		//키보드로 정수를 입력받은 정수가 양수이면서 짝수일때만 "짝수다"를 출력하고 짝수가 아니면
		//"홀수다를 출력 양수가 아니면"양수만 입력해주세요 출력
		
	Scanner scan = new Scanner(System.in);
	int num;
	System.out.print("숫자 한 개 입력하세요: ");
	num = scan.nextInt();
	
	if (num>=0) {
		if(num % 2 ==0) {
			System.out.println("짝수다 ");
		}else {
			System.out.println("홀수다 ");
		}
	}else {
		System.out.println("양수만 입력해주세요.");
	}

	}

}
