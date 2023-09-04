package com.kh.example.practice2.run;
//import는 최초 1회만 맨 위에 작성 
import com.kh.example.practice2.model.vo.Product;

public class ProductRun {

	public static void main(String[] args) {
		// Product 생성 3개 하고 각각 상품명,가격,브랜드명 출력하기 
		Product product1 = new Product("Bape hoodie", 280000 ,"베이프");
		Product product2 = new Product("HYS T-shirt", 160000 ,"히스테릭글래머");
		Product product3 = new Product("Supreme ZipUp", 300000 ,"슈프림");
		
		System.out.println("Product 정보 : ");
		product1.information();
		product2.information();
		product3.information();
		
	}

}
