package day11;

public class MainClass03 {

	public static void test() {
		System.out.println("main test입니다.");
	}
	
	public static void main(String[] args) {
		
		// 2) 오류 해결 
		// test 메소드가 있는 class 객체를 생성 후 호출
		
		// MainClass03 m = new MainClass03();
		// m.test(); 
		
		
		test();
		
		// 1) 오류 발생 
		// static 을 사용하고 실행하면 static이 젤 우선순위로 실행
		// 위에 있는 test 메소드는 아직 객체가 생성되지 않아서 사용 불가한 상황 
		
		// 3) test(); 단독으로 사용하고 싶을 경우
		// 해당 메소드에 static 추가하기
		
		
		// TestClass03 t = new TestClass03();
		
		System.out.println( TestClass03.name );
		TestClass03.test();
		
		System.out.println( TestClass03.KOREA );
		
	}
}
