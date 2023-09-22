package chap37_TodoList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TodoList_practice {
	private Map<Integer,String> tasks;
	private int nextId = 1;
	
	public TodoList_practice() {
		tasks = new HashMap<>();
		nextId = 1;//첫번째 번호
	}
	public void addTask(String task) {
		tasks.put(nextId,task);
		nextId++; // 번호가 하나씩 증가
	}
	public void removetask(int Id) {
		if(tasks.containsKey(Id)) {//번호를 입력받아, tasks안에 Id가 있다면,
			tasks.remove(Id);
		}else {
			System.out.println("번호가 없어요.");
			
		}
	}
	public void displayTasks(int numb,String task) {
		System.out.println("To-Do List : ");
		for(Map.Entry<Integer, String> entry : tasks.entrySet()) {
			System.out.println(entry.getClass()+ "-"+entry.getValue());
		}
	}

	public static void main(String[] args) { 
		TodoList todoList = new TodoList();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("할 일 추가: add, 삭제:remove, 할일 보기:list, 종료:exit 를 입력하세요.");
			
			String choice = sc.nextLine(); 
			//문자가 대문자인지 소문자인지 상관않고 보겠다.
			if(choice.equalsIgnoreCase("add")) {
				System.out.println("우선순위와 할 일(spaceBar사용)");
				int numb = sc.nextInt();
				String task = sc.nextLine();
				todoList.addTask(task);
				
			}else if(choice.equalsIgnoreCase("remove")) {
				System.out.println("삭제할 일 번호 입력하기");
				try {
					int index = Integer.parseInt(sc.nextLine())-1;
					todoList.removetask(index);
				}catch (Exception e){
					System.out.println("유효하지 않은 입력입니다.");
					
				}
			}else if (choice.equalsIgnoreCase("List")) {
				 todoList.displayTasks(0, null);
	
			}else if(choice.equalsIgnoreCase("exit")) {
				break;
			}else {
				System.out.println("잘못된 명령입니다.");
			}
		}
		System.out.println("어플리케이션 종료");
		sc.close(); 
		
	}

}
