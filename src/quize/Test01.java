package quize;

import java.util.Scanner;

	public class Test01 {
		
		// �� Ǯ�� 
		/*
		int age;
		String name;
		
		public String input(String name, int age) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("�̸� �Է�");
			name = sc.next();
			System.out.println("���� �Է�");
			age = sc.nextInt();
			
			return name;
		}
		
		public void print(String name, int age) {
			System.out.println("�̸� : " + name);
			System.out.println("���� : " + (age-1));
		}
		*/
		
		// ������ Ǯ��
		public String name;
		public int age;
		public void input() {
			
			System.out.println("�Է¹޴� ��� ����");
			Scanner sc = new Scanner(System.in);
			System.out.println("�̸� �Է�");
			name = sc.next();
			System.out.println("���� �Է�");
			age = sc.nextInt(); 
			op();
		}
		
		public void op() {
			System.out.println("�����ϴ� ��� ����");
			age = age -1;
			System.out.println("age : " + age);
		}
		
		public void print() {
			System.out.println("����ϴ� ��� ����");
			System.out.println("�̸� : " + name);
			System.out.println("���� : " + age);
		}
}
