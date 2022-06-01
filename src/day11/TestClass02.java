package day11;

public class TestClass02 {

	// 인스턴스 변수 
	// 여러공간에서 많이 사용되는 변수는 인스턴스 변수로 만들어서 사용
	// 일회성으로 사용하는 변수는 지역변수로 선언 
	
	public int num = 100;
	public String name;
	
	public void test01() {
		name = "홍길동";
		System.out.println("test01 : " + num);
	}
	
	public void test02() {
		System.out.println("이름 : " + name);
		System.out.println("test02 : " + num);
	}
	
}
