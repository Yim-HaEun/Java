package Practice_ifSwitch;
import java.util.Scanner;
public class practice04 {

	public static void main(String[] args) {
		//봄 여름 가을 겨울예제를switch문으로
		Scanner scan = new Scanner(System.in);
	int month;
	System.out.print("1~12 사이의 정수 입력 ");
	month = scan.nextInt();
	switch(month) {
	case  3: case 4: case 5:
		System.out.println(month+"월은 봅입니다.");
		break;
	case  6: case 7: case 8:
		System.out.println(month+"월은 여름입니다.");
		break;
	case  9: case 10: case 11:
		System.out.println(month+"월은 가을입니다.");
		break;
	case  12: case 1: case 2:
		System.out.println(month+"월은 겨울입니다.");
		break;
	default :
		System.out.println(month +"월은 잘못 입력된 달입니다.");
			
			
	}
	}

}
