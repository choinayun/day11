package day11;

import java.util.Scanner;

public class TestClass04 {

	
	public void display() {
		Scanner input = new Scanner(System.in);
		int age;
		String name;
		System.out.println("이름 입력");
		name = input.next();
		System.out.println("나이 입력");
		age = input.nextInt();
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		
	}
	
	
	
}
