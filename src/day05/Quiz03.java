package day05;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		
//		int user=0;
//		String id=null, password=null, user_id=null, user_password=null;
//		Scanner input = new Scanner(System.in);
//		
//		while(true) {
//			System.out.println("1. �α���");
//			System.out.println("2. ȸ������");
//			System.out.println("3. ������");
//			System.out.print(">>>");
//			
//			user = input.nextInt();
//			
//			if(user==1) {
//				System.out.print("���̵� �Է�: ");
//				user_id = input.next();
//				System.out.print("��й�ȣ �Է�: ");
//				user_password = input.next();
//				
//				if(user_id.equals(id) && user_password.equals(password)) {
//					System.out.println("���� ����!");
//				}else {
//					System.out.println("���� ����!");
//					System.out.println();
//				}
//			}else if(user==2) {
//				System.out.println("���� �� ���̵� �Է�: ");
//				id = input.next();
//				System.out.println("���� �� ��й�ȣ �Է�: ");
//				password = input.next();
//				System.out.println("���� �Ϸ�!");
//				System.out.println();
//			}else if(user==3) {
//				System.out.println("���α׷��� �����մϴ�.");
//				break;
//			}else {
//				System.out.println("�ٽ� �Է����ּ���.");
//				System.out.println();
//			}
//		}
		
		int money, user, balance=0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("����� �����ϼ���. >>> ");
		money = input.nextInt();
		
		while(true) {
			System.out.println("========== Ŀ�� ���Ǳ� ==========");
			System.out.println();
			System.out.println("1. Ŀ��(200)\t 2. ���ھ�(250)\t 3. ��ȯ\t 4. ����");
			System.out.print("�޴��� �����ϼ��� >>> ");
			user = input.nextInt();
			
			if(user==1) {
				if(money>=200) {
					System.out.println("Ŀ�ǰ� ���Խ��ϴ�.");
					System.out.println("���ְ� �弼��.");
					balance = money-200;
					money = balance;
					System.out.println("�ܾ�: " + balance + "��");
					System.out.println();
				}else {
					System.out.println("�ܾ��� �����մϴ�.");
				}
			}else if(user==2) {
				if(money>=250) {
					System.out.println("���ھư� ���Խ��ϴ�.");
					System.out.println("���ְ� �弼��.");
					balance = money-250;
					money = balance;
					System.out.println("�ܾ�: " + balance + "��");
					System.out.println();
				}else {
					System.out.println("�ܾ��� �����մϴ�.");
				}
			}else if(user==3) {
				System.out.println("�ܾ��� ��ȯ�˴ϴ�.");
				System.out.println("�Ž�����: " + money);
				money = 0;
			}else if(user==4) {
				System.out.println("���α׷� ����!");
				break;
			}else {
				System.out.println("�ٽ� �Է����ּ���.");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
