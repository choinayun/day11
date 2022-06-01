package day11;

public class TestClass01 {

	public int test01() {
		int num = 100;
		System.out.println("test01 : " + num);
		return num;
	}
	
	public void test02(int num) {
		System.out.println("test02 : " + num);
	}
	
	// 1) test01 : 100
	// 해당하는 지역에서 만든 변수는 해당지역에서만 사용가능 
	// 2) test02 에서도 100이 나오게 만들기
	
}
