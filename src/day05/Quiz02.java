package day05;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
//		int n, n2, sum=0, sum2=0;
		Scanner input = new Scanner(System.in);
//		
//		while(true) {
//			System.out.print("�� �Է�: ");
//			n = input.nextInt();
//			
//			if(n>0 && n<11) {
//				for(int i=0 ; i<=n ; i++) {
//					sum+=i;
//				}
//				System.out.println("1���� " + n + "���� ������ ���� " + sum);
//				break;
//			}else {
//				System.out.println("1~10 ������ ���ڸ� �Է� �����մϴ�.");
//				continue;
//			}
//		}
//			
//		while(true) {
//			System.out.print("�� �Է�: ");
//			n2 = input.nextInt();
//			
//			if(n2>9 && n2<21) {
//				for(int j=0 ; j<=n2 ; j++) {
//					sum2+=j;
//				}
//				System.out.println("1���� " + n2 + "���� ������ ���� " + sum2);
//				break;
//			}else {
//				System.out.println("10~20 ������ ���ڸ� �Է� �����մϴ�.");
//				continue;
//			}
//		}
	
		
		// �� ���� �Է� �޾� �Է� ���� �� ������ ���� ���ϼ���.
		// �Է� ��: 1 10 -> 55, 10 1 -> 55
		
		
		int num1, num2, sum=0;
		int a=0, b=0;

		System.out.println("�� ���� �Է��ϼ���.");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		if(num1>num2) {
			a = num2;
			b = num1;
		}else{
			a = num1;
			b = num2;
		}
		
		for(int i=a ; i<=b ; i++) {
			sum+=i;
		}
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
