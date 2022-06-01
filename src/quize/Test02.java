package quize;

import java.util.Scanner;

public class Test02 {

	public String name, grade;
	public int kor, eng, math, sum;
	public double avg;
	// 입력, 연산, 출력 기능을 만들어주세요 
	// 입력 : 이름, 국, 영, 수
	// 연산 : 합을 구하는 기능 , 평균을 구하는 기능, 등급 구하는 기능  
	// 출력 : 이름, 국, 영, 수, 합, 평균, 등급 
	// 등급 : 평균이 90이상 A, 80이상 B 나머진 C 
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력");
		name = sc.next();
		System.out.println("국어 점수 입력");
		kor = sc.nextInt();
		System.out.println("영어 점수 입력");
		eng = sc.nextInt();
		System.out.println("수학 점수 입력");
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
		System.out.println("==" + name + "의 성적표==");
		System.out.println("국어 점수 : " + kor);
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : " + math);
		System.out.println("총 합 : " + sum);
		System.out.println("평 균 : " + avg);
		System.out.println("등 급 : " + grade);
	}
}
