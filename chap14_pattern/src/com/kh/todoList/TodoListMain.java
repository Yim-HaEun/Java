package com.kh.todoList;

public class TodoListMain {

	public static void main(String[] args) {
		TodoListModel tdmodel = new TodoListModel("��ħ �Ա�!");
		TodoListView tdView = new TodoListView();
		
		//System.out.println(tdmodel);
		
		System.out.println(tdmodel.getItem());
		String item = tdmodel.getItem();
		
		tdView.displayTodoList(tdView);
		
	}

}
