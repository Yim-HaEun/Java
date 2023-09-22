package chap37_TodoList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TodoList_case {
	public static void main(String[] args) {
		Map<Integer, String> todoMap = new HashMap<>();
		int taskNum = 1;
		
		Scanner sc = new Scanner(System.in);
		//할 일 목록을 적자
		while(true) {
			System.out.println("할 일 목록 : ");
			
			System.out.println("할 일을 선택하세요 : ");
			System.out.println("할 일 추가는 숫자 1을 넣어주세요");
			System.out.println("할 일 제거는 숫자 2를 넣어주세요.");
			System.out.println("종료하시려면 숫자 3을 넣어주세요");
			System.out.println("할일 목록 출력하려면 숫자 4를 넣어주세요.");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
				case 1:
					System.out.println("추가 할 일 작성.");
					String todoItem = sc.nextLine();
					todoMap.put(taskNum++, todoItem);
					System.out.println("할 일이 추가되었습니다.");
					break;
				
				case 2:
					System.out.println("제거할 일의 번호를 입력하세요.");
					int removeNum = sc.nextInt();
					if(todoMap.containsKey(removeNum)) {
						todoMap.remove(removeNum);
						System.out.println("할 일이 제거되었습니다.");
					}else {
						System.out.println("해당 번호의 할 일이 없습니다.(번호 잘못입력)");
					}
					break;
				
				case 3:
					System.out.println("프로그램 종료됨.");
					System.out.println("bye~");
					sc.close();
					System.exit(0);
					break;
				case 4: 
					System.out.println("할 일 목록 보여드릴게요.");
					for(Map.Entry<Integer, String> entry : todoMap.entrySet()) {
						System.out.println(entry.getKey() + " : " + entry.getValue());
					
					}
					break;
				
				default:
					System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");
				
			}
		}
	}

}
