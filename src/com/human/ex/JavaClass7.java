package com.human.ex;

public class JavaClass7 {

	public static void main(String[] args) {
		//두 숫자를 입력 받아 더하는 프로그램
		//1. 스캐너 생성
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		//2. 첫번째 숫자 입력받기.
		System.out.println("더하고자 하는 첫번 째 숫자를 입력하세요.");
		String str=sc.nextLine();
		int i1=Integer.parseInt(str);
		//사용자가 입력한 숫자가 int형 변수 i1에 들어가있다
		
		//3.두번 째 숫자 입력받기.
		System.out.println("더하고자 하는 두번 째 숫자를 입력하세요.");
		String str1=sc.nextLine();
		int i2=Integer.parseInt(str1);
		
		//4. 두 숫자의 합계 구하기.
		System.out.println("두 숫자의 합은 "+(i1+i2)+" 입니다");
	}

}
