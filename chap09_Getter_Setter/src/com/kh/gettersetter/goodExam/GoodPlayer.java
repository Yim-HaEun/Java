package com.kh.gettersetter.goodExam;


public class GoodPlayer {
	private String name; //캐릭터 이름
	private int health; //체력
	private int attackPower; // 공격파워

	public void setName(String name) {//이름이 변경되면 저장될 set
		this.name = name;
	}
	//검증하는 valid
	public void ValidName() {//캐릭터 이름에 공백이 없는지 검증!
		if(this.name == "") {
			this.name = "No Name";
			
		}
	}
	public String getName() { //캐릭터 이름을 반환
	return name;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	public void isValidHealth() { //체력이 0이하면 캐릭터 사망
		if(health <= 0) {
			this.health = 0;
		}
	}
	public int getHealth() {
		return health;
	}
	//0 미만의 값을 넣어도 0 이하의 값이 출력되지 않음
	public void setAttackPower(int attackPower){
		this.attackPower = attackPower;
	}
	public void ValidAttackPower() {//무결성되게 검증
		if(attackPower <= 0) {
			attackPower = 0;
		}
	}
		
	public int getAttackPower() {
		return attackPower;
	}

	//캐릭터 정보 출력 메소드 작성
	public void displayInfo() {
		System.out.println("캐릭터 정보 :"+ this.name);
		System.out.println("체력 정보 : " + this.health);
		System.out.println("공격 파워 : "+ this.attackPower);
	}
	
	//캐릭터 공격하는 출력 메서드
	public void attack(GoodPlayer target) {
		System.out.println("["+ name + "]" + "이 공격했습니다." +"["+ target.getName() +"]"+ "-" + attackPower);
	}
	
	//다른 캐릭터로부터 공격 받았을 때 메서드
	public void takeDamage(int damage) {
		System.out.println("공격 받았습니다.");
	}
	
	
}
