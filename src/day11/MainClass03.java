package day11;

public class MainClass03 {

	public static void test() {
		System.out.println("main test�Դϴ�.");
	}
	
	public static void main(String[] args) {
		
		// 2) ���� �ذ� 
		// test �޼ҵ尡 �ִ� class ��ü�� ���� �� ȣ��
		
		// MainClass03 m = new MainClass03();
		// m.test(); 
		
		
		test();
		
		// 1) ���� �߻� 
		// static �� ����ϰ� �����ϸ� static�� �� �켱������ ����
		// ���� �ִ� test �޼ҵ�� ���� ��ü�� �������� �ʾƼ� ��� �Ұ��� ��Ȳ 
		
		// 3) test(); �ܵ����� ����ϰ� ���� ���
		// �ش� �޼ҵ忡 static �߰��ϱ�
		
		
		// TestClass03 t = new TestClass03();
		
		System.out.println( TestClass03.name );
		TestClass03.test();
		
		System.out.println( TestClass03.KOREA );
		
	}
}
