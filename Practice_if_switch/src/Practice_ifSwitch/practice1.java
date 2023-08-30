package Practice_ifSwitch;
import java.util.Scanner;
public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub1
		Scanner scan = new Scanner(System.in);
		int menu ;
		System.out.println("1.입력  2.수정  3.조회 4. 삭제  7.종료" );
		System.out.print("메뉴 번호를 입력하세요.");
		
		menu = scan.nextInt();
		
		switch (menu) {
			
		case 1 :
			System.out.println("입력 메뉴입니다.");
			break;
		case 2 :
			System.out.println("수정  메뉴입니다.");
			break;
		case 3 :
			System.out.println("조회  메뉴입니다.");
			break;
		case 4 :
			System.out.println("삭제 메뉴입니다.");
			break;
		case 7:
			System.out.println("종료  메뉴입니다.");
			break;
		
		
		}

	}

}
