package day05;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		/*
		 * break: 반복문, switch문을 빠져 나올 때 사용한다.
		 * continue: 반복문의 위쪽으로 올려 보낸다.
		 */

//		for(int i=0 ; i<5 ; i++) {
//			if(i==3) {
//				System.out.println("if 실행");
//				//continue;
//				break;
//			}
//			System.out.println("i: " + i);
//		}
		
//		int n1 = 10, n2 = 10;
//		if(n1==n2) {
//			System.out.println("두 수는 같다.");
//		}
		
		String s1, s2;
		Scanner input = new Scanner(System.in);
		
		System.out.println("문자 입력");
		s1 = input.next();
		
		System.out.println("문자 입력");
		s2 = input.next();
		
		if(s1.equals(s2))//문자열을 비교할 때는 (s1 == s2) 이렇게는 불가능 .equals()를 써야함 
		{
			System.out.println("두 문자는 같다.");
		}
		System.out.println(s1.equals(s2));
		
		
		
		
		
		
		
		
		
		
	}

}
