package day05;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		
//		int user=0;
//		String id=null, password=null, user_id=null, user_password=null;
//		Scanner input = new Scanner(System.in);
//		
//		while(true) {
//			System.out.println("1. 로그인");
//			System.out.println("2. 회원가입");
//			System.out.println("3. 나가기");
//			System.out.print(">>>");
//			
//			user = input.nextInt();
//			
//			if(user==1) {
//				System.out.print("아이디 입력: ");
//				user_id = input.next();
//				System.out.print("비밀번호 입력: ");
//				user_password = input.next();
//				
//				if(user_id.equals(id) && user_password.equals(password)) {
//					System.out.println("인증 성공!");
//				}else {
//					System.out.println("인증 실패!");
//					System.out.println();
//				}
//			}else if(user==2) {
//				System.out.println("저장 할 아이디 입력: ");
//				id = input.next();
//				System.out.println("저장 할 비밀번호 입력: ");
//				password = input.next();
//				System.out.println("가입 완료!");
//				System.out.println();
//			}else if(user==3) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}else {
//				System.out.println("다시 입력해주세요.");
//				System.out.println();
//			}
//		}
		
		int money, user, balance=0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("요금을 투입하세요. >>> ");
		money = input.nextInt();
		
		while(true) {
			System.out.println("========== 커피 자판기 ==========");
			System.out.println();
			System.out.println("1. 커피(200)\t 2. 코코아(250)\t 3. 반환\t 4. 종료");
			System.out.print("메뉴를 선택하세요 >>> ");
			user = input.nextInt();
			
			if(user==1) {
				if(money>=200) {
					System.out.println("커피가 나왔습니다.");
					System.out.println("맛있게 드세요.");
					balance = money-200;
					money = balance;
					System.out.println("잔액: " + balance + "원");
					System.out.println();
				}else {
					System.out.println("잔액이 부족합니다.");
				}
			}else if(user==2) {
				if(money>=250) {
					System.out.println("코코아가 나왔습니다.");
					System.out.println("맛있게 드세요.");
					balance = money-250;
					money = balance;
					System.out.println("잔액: " + balance + "원");
					System.out.println();
				}else {
					System.out.println("잔액이 부족합니다.");
				}
			}else if(user==3) {
				System.out.println("잔액이 반환됩니다.");
				System.out.println("거스름돈: " + money);
				money = 0;
			}else if(user==4) {
				System.out.println("프로그램 종료!");
				break;
			}else {
				System.out.println("다시 입력해주세요.");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
