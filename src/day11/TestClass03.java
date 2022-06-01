package day11;

public class TestClass03 {
	
	public static final String KOREA = "대한민국";

	public int num = 1000;
	public void test02() {
		num = 1234;
	}
	// test02 에서만 static 사용하면 오류 
	// 동시에 static 사용하거나 
	// num 변수 선언에 static 사용해야 오류 안남 
	
	
	public static String name = "홍길동";

	// Class 변수 
	// static 키워드를 붙이면 Main에서 객체를 생성하지 않아도 
	// 해당 Class의 이름으로 접근 가능 
	
	// static 키워드를 사용할때는 
	// 어디서든 자주 사용되는 값들 설정할때 사용
	
	public static void test() {
		System.out.println("test 실행");
	}
	
}
