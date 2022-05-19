package day05;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		int i=0;
//		for(;i<3;) {
//			System.out.println(i);
//			i++;
//		}

		while(i<3) {
			System.out.println(i);
			i++;
		}
		
		Scanner input = new Scanner(System.in);
		int sum = 0;
		i = 0;
		while(true) {
			System.out.println("수 입력(1~100)");
			i = input.nextInt();
			if(i >= 1 && i<= 100) {
				break;
			}
			System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
		}
		
		for(int j = 1; j <= i; j++) {
			sum+=j;
		}
		System.out.println("입력 받은 수까지의 합: " + sum);
		
		
		
		
		
		
		
		
		
	}

}
