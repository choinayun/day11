package quize;

import java.util.Scanner;

public class Test02 {

	public String name, grade;
	public int kor, eng, math, sum;
	public double avg;
	// �Է�, ����, ��� ����� ������ּ��� 
	// �Է� : �̸�, ��, ��, ��
	// ���� : ���� ���ϴ� ��� , ����� ���ϴ� ���, ��� ���ϴ� ���  
	// ��� : �̸�, ��, ��, ��, ��, ���, ��� 
	// ��� : ����� 90�̻� A, 80�̻� B ������ C 
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸� �Է�");
		name = sc.next();
		System.out.println("���� ���� �Է�");
		kor = sc.nextInt();
		System.out.println("���� ���� �Է�");
		eng = sc.nextInt();
		System.out.println("���� ���� �Է�");
		math = sc.nextInt();
		op();
	}
	
	public void op() {
		sum = kor + eng + math ;
		
		avg = sum/3.0;
		
		if(avg >= 90) {
			grade = "A";
		}else if(avg >= 80) {
			grade = "B";
		}else {
			grade = "C";
		}
	}
	
	public void print() {
		System.out.println("==" + name + "�� ����ǥ==");
		System.out.println("���� ���� : " + kor);
		System.out.println("���� ���� : " + eng);
		System.out.println("���� ���� : " + math);
		System.out.println("�� �� : " + sum);
		System.out.println("�� �� : " + avg);
		System.out.println("�� �� : " + grade);
	}
}
