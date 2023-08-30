package Practice_ifSwitch;
import java.util.Scanner;
public class practice03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int kScore,mScore,eScore,total;
		double avg;
	
		System.out.print("국어 점수: ");
		kScore = scan.nextInt();
		
		System.out.print("수학 점수: ");
		mScore = scan.nextInt();
		
		System.out.print("영어 점수: ");
		eScore = scan.nextInt();
		
		System.out.println("국어  : :"+kScore);
		System.out.println("수학  :"+ mScore);
		System.out.println("영어   :"+eScore);
		
		total = kScore+mScore+eScore;
		avg = total/3;
		if (avg >= 60) {
			System.out.println("합계: " + total);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		}
	}

}
