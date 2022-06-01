package quize;

import java.util.Scanner;

public class Quize03 {

	public static void main(String[] args) {
		
		Test03 t = new Test03();
		
		int num = 0, gamenum = 0, ran = 0, i = 0, hs = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("=== UP & Down Game ===");
			System.out.println("1. 게임시작 ");
			System.out.println("2. 게임전적 ");
			System.out.println("3. 게임종료 ");
			System.out.println("   >>>>");
			num = sc.nextInt();
			
			switch(num) {
				case 1 :
					t.random();
					System.out.println("컴퓨터 숫자 : " + ran);
					System.out.println("=== START ===");
					
					for(i = 0; ran != gamenum ; i++) {
						
						if(ran != gamenum) {
							System.out.println("Input Number -->");
							gamenum = sc.nextInt();
							
							if(gamenum < ran){
								System.out.println("=== U  P ===");			
							}else if(gamenum > ran) {
								System.out.println("=== Down ===");
							}
						}

					} System.out.println(i + "회 만에 맞췄습니다.");
					
					hs = i;
					
				case 2 : 
					
					if(i == 0) {
						System.out.println("게임을 시작하지 않았습니다.");
					}else if(hs > i){
						System.out.println("최고 기록을 갱신하셨습니다.");
					}
					
					break;
				case 3 : 
					System.exit(1);
			}
		
		}
	}
}
